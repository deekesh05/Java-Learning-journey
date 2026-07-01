import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Prepared_Statement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Dk@8878545059";
        // show all data
        //String sql = "select * from employee";
        String sql  = "select * from employee where id = ? ";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successful");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,1);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs. getString("name");
                String job_Title = rs. getString("job_Title");
                double salary = rs. getDouble("salary");

                System.out.println("=========================================================");
                System.out.println("id : " + id);
                System.out.println("name : " + name);
                System.out.println("Job Title : " + job_Title);
                System.out.println("salary : " + salary);

            }
        } catch (SQLException e) {
            System.out.println("Connection Failed");
        }
    }
}
