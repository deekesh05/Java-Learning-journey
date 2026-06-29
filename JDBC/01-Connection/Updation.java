import java.sql.*;

public class Updation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Dk@8878545059";
        String query = "Update Employee set name = 'Rahul',job_Title = 'Account' ,salary = 56000 where id = 5";
        String query2 = "Select * from Employee;";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully ");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try
        {
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            int rowsAffected = st.executeUpdate(query);
            if (rowsAffected>0)
            {
                System.out.println("Updation Successfully ");
            }
            else
            {
                System.out.println("Updation Failed ");
            }

            ResultSet rs = st.executeQuery(query2);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_Title = rs.getString("job_Title");
                double salary = rs.getDouble("salary");
                System.out.println();
                System.out.println("=================================================");
                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Job Title : " + job_Title);
                System.out.println("Salary : " + salary);
            }
            rs.close();
            st.close();
            con.close();
            System.out.println();
            System.out.println("Connection Closed Successfully ");

            st.close();
            con.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
