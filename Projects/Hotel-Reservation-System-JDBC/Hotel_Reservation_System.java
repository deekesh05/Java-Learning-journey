import java.sql.*;
import java.util.Scanner;

public class Hotel_Reservation_System {
    private static final String url =  "jdbc:mysql://localhost:3306/Hotel_db";
    private static final String username = "root";
    private static final String password = "Dk@8878545059";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Load Drivers
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //Connection
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            while(true) {
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                System.out.println("1. Reserve a Room ");
                System.out.println("2. View Reservations ");
                System.out.println("3. Get Room Number ");
                System.out.println("4. Update Reservation ");
                System.out.println("5. Delete Reservation ");
                System.out.println("0. Exit ");
                System.out.print("Choose an Option By Number : ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice)
                {
                    case 1:
                        reserveRoom(scanner,statement);
                        break;
                    case 2:
                        viewReservation(statement);
                        break;
                    case 3:
                        getRoomNumber(scanner,statement);
                        break;
                    case 4:
                        updateReservation(scanner,statement);
                        break;
                    case 5:
                        deleteReservation(scanner,statement);
                        break;
                    case 0:
                        exit();
                        connection.close();
                        statement.close();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }


    }
    //RESERVE A ROOM
    private static void reserveRoom(Scanner scanner,Statement statement)
    {

            System.out.println("RESERVE A ROOM ");
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();


            System.out.print("Enter Room Number : ");
            int room_number = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Contact Number : ");
            String contact_number =  scanner.nextLine();


            String sql = "insert into reservation(guest_name,room_number,contact_number)" +
                    "values( '" + name  + "'," + room_number  + ",'"  + contact_number +  "');";

            try{
                int affectedRow = statement.executeUpdate(sql);
                if(affectedRow>0)
                {
                    System.out.println("Reservation Successful!!!!");
                }
                else
                {
                    System.out.println("Reservation Failed!!!");
                }
            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
    }
    //View Reservation
    private static void viewReservation(Statement statement)
    {

        String sql = "select * from reservation;";
        try {
            ResultSet rs =  statement.executeQuery(sql);
            System.out.println("Current Reservations:");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
            System.out.println("| Reservation ID | Guest           | Room Number   | Contact Number      | Reservation Date        |");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");

            while (rs.next())
            {
                int id = rs.getInt("reservation_id");
                String name =     rs.getString("guest_name");
                int room_number = rs.getInt("room_number");
                String contact =  rs.getString("contact_number");
                String date =     rs.getString("reservation_date").toString();


                System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-21s | \n",id,name,room_number,contact,date);
                System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }

    //GET ROOM NUMBER
    private static void getRoomNumber(Scanner scanner,Statement statement)
    {
        System.out.print("Enter Reservation ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();   // Buffer clear

        System.out.print("Enter Customer Name : ");
        String name = scanner.nextLine();


        String sql = "select room_number from reservation where  reservation_id="
                +id + " and guest_name = '" + name + "';";
        try
        {
            ResultSet rs = statement.executeQuery(sql);

            if(rs.next()){
                int roomNumber = rs.getInt("room_number");
                System.out.println("Room number for Reservation ID " + id +
                    " and Guest " + name + " is: " + roomNumber);
        } else {
        System.out.println("Reservation not found for the given ID and guest name.");
    }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //UPDATE RESERVATION
    private static void updateReservation(Scanner scanner,Statement statement)
    {
        System.out.print("Enter Reservation ID Which Want to change : ");
        int id = scanner.nextInt();
        scanner.nextLine();   // Buffer clear
        //Check ID is Exist or not
        if(!reservationExist(statement,id))
        {
            System.out.println("Reservation not found for the given ID.");
            return;
        }
        System.out.print("Enter new Guest Name : ");
        String newGuestName = scanner.nextLine();

        System.out.print("Enter New Room Number : ");
        int newRoomNumber  = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Contact Number : ");
        String newContactNumber = scanner.nextLine();

        String sql = "Update reservation set guest_name = '" + newGuestName +
                "', room_number = "+ newRoomNumber +
                ", contact_number = '" + newContactNumber +
                "' where reservation_id = " +id;

        try
        {
            int affectedRow = statement.executeUpdate(sql);
            if(affectedRow>0)
            {
                System.out.println("Reservation Updated for ID " + id + " is Successful ");
            }
            else
            {
                System.out.println("Updation Failed");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void deleteReservation(Scanner scanner,Statement statement)
    {
        System.out.print("Enter ID which you want to Delete : ");
        int id = scanner.nextInt();

        if(!reservationExist(statement,id))
        {
            System.out.println("Reservation not found for the given ID.");
            return;
        }
        String sql = "delete from reservation where reservation_id = " + id +";";

        try {
            int rowAffected = statement.executeUpdate(sql);
            if(rowAffected>0)
            {
                System.out.println("Reservation id " + id + " is deleted Successful ");
            }else
            {
                System.out.println("Deletion Failed ");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static  boolean reservationExist(Statement statement,int id)
    {
        try{
            String sql = "select reservation_id from reservation where reservation_id = " + id + ";";
            ResultSet rs = statement.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return false;
    }

    private static  void exit() throws InterruptedException
    {
        System.out.print("Exiting System");
        for (int i = 5; i >0 ; i--) {
            System.out.print(".");
            Thread.sleep(650);
        }
        System.out.println();
        System.out.println("ThankYou For Using Hotel Reservation System!!!");
    }











}
