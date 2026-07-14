import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
    private Connection connection;
    private Scanner scanner;

    public User(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void register()
    {
        scanner.nextLine();
        System.out.print("Full Name: ");
        String full_name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if(userExist(email))
        {
            System.out.println("Email already Exist for this Email !!!!");
            return;
        }
        String query = "INSERT INTO user(full_name,email,password) values (?,?,?)";
        try
        {
            PreparedStatement registerStatement = connection.prepareStatement(query);
            registerStatement.setString(1,full_name);
            registerStatement.setString(2,email);
            registerStatement.setString(3,password);
            int affectedRow = registerStatement.executeUpdate();
            if(affectedRow>0)
            {
                System.out.println("User Registered!!!!");
            }
            else
            {
                System.out.println("Registration Failed");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public String login()
    {
        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if(!userExist(email))
        {
            System.out.println("Invalid Email Address!!!");
        }
        String query = "SELECT * FROM User WHERE email = ? AND password = ?";
        try
        {
            PreparedStatement checkLogin = connection.prepareStatement(query);
            checkLogin.setString(1,email);
            checkLogin.setString(2,password);
            ResultSet rs = checkLogin.executeQuery();
            if(rs.next())
            {
                return email;
            }
            else
            {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean userExist(String email)
    {
        String query = "SELECT * FROM user where email = ?";
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,email);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
