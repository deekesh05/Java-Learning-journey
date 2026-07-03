import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankingApp {

    private  static String url = "jdbc:mysql://localhost:3306/banking_system";
    private  static String username = "root";
    private  static String password = "Dk@8878545059";
    public static void main(String[] args) {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully ");

        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Success ");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
