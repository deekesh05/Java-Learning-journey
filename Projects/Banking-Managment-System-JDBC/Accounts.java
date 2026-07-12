import java.sql.*;
import java.util.Scanner;

public class Accounts {
    private Connection connection;
    private Scanner scanner;

    public Accounts(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public long open_account(String email)
    {
        if(!account_exists(email))
        {
            String query = "INSERT INTO accounts (account_number,full_name,email,balance,security_pin) " +
                                                 "values(?,?,?,?,?)";
            scanner.nextLine();
            System.out.print("Enter Full Name : ");
            String full_name = scanner.nextLine();
            System.out.print("First Deposit : ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter Security Pin : ");
            String security_pin = scanner.nextLine();

            try
            {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                long account_number = generateAccountNumber();
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,full_name);
                preparedStatement.setString(3,email);
                preparedStatement.setDouble(4,balance);
                preparedStatement.setString(5,security_pin);
                int rowAffected = preparedStatement.executeUpdate();
                if(rowAffected>0)
                {
                    return account_number;
                }
                else
                {
                    throw new RuntimeException("Account Creation Failed!!!");
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException("Account Already Exists!!!");
    }

    public long getAccountNumber(String email)
    {
        String sql = "Select account_number FROM accounts where email = ?";

        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next())
            {
                return rs.getLong("account_number");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Account Number Doesn't Exists!!!!");
    }

    private long generateAccountNumber()
    {
        try{
            Statement statement = connection.createStatement();
            String sql  = "SELECT account_number FROM accounts order BY account_number DESC Limit 1";
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next())
            {
                long last_account_number = rs.getLong("account_number");
                return last_account_number+1;
            }else
            {
                return 10000100;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean account_exists(String email)
    {
        String query = "SELECT account_number FROM accounts where email = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next())
            {
                return true;
            }
            else
            {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
