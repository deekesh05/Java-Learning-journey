import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test_Connection {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Dk@8878545059";
        String query = "Select * from Employee;";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully ");

        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        // Create Connection
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Database Connected Successfully ");
            Statement st  = con.createStatement();
            ResultSet rs = st.executeQuery(query);
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

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
