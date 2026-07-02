import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessing {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Dk@8878545059";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successful");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try
        {
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful!!");
            con.setAutoCommit(false);
            String sql = "INSERT INTO employee(name,job_Title,salary) values(?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            Scanner input = new Scanner(System.in);

            while (true)
            {
                System.out.print("Enter Name : ");
                String name = input.nextLine();
                System.out.print("Job Title : ");
                String job_Title = input.nextLine();
                System.out.print("Enter Salary : ");
                double salary = input.nextDouble();
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,job_Title);
                preparedStatement.setDouble(3,salary);
                input.nextLine();
                preparedStatement.addBatch();
                System.out.println("Want to add more Values YES/No : ");
                String decision =  input.nextLine();
                if(decision.toUpperCase().equals("NO"))
                {
                    break;
                }
            }
            int [] batch = preparedStatement.executeBatch();
            con.commit();
            int size = batch.length;
            System.out.println(size + " Entries are Added ");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
