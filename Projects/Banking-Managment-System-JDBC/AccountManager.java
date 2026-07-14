import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountManager {

    private Connection connection;
    private Scanner scanner;

    public AccountManager(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void credit_money(long account_number) throws SQLException {
        scanner.nextLine();
        System.out.print("Enter Amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Security pin : ");
        String security_pin = scanner.nextLine();

        try{
            connection.setAutoCommit(false);
            if(account_number!=0)
            {
                String sql = "SELECT * FROM accounts where account_number = ? AND security_pin = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,security_pin);
                ResultSet rs = preparedStatement.executeQuery();

                if(rs.next())
                {
                    String query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
                    PreparedStatement creditMoney = connection.prepareStatement(query);
                    creditMoney.setDouble(1,amount);
                    creditMoney.setLong(2,account_number);
                    int rowAffected = creditMoney.executeUpdate();
                    if(rowAffected>0)
                    {
                        System.out.println(amount + " Credited Transaction Successful" );
                        connection.commit();
                        connection.setAutoCommit(true);
                        return;
                    }
                    else {
                        System.out.println("Transaction Failed!!!");
                        connection.rollback();
                        connection.setAutoCommit(true);
                    }
                }
                else {
                    System.out.println("Invalid Security Pin");
                    connection.rollback();

                }
            }
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        connection.setAutoCommit(true);
    }



    public void debit_money(long account_number) throws SQLException {
        scanner.nextLine();
        System.out.print("Enter Amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Security Pin : ");
        String security_pin = scanner.nextLine();

        try{
            connection.setAutoCommit(false);
            if(account_number!=0){
                String sql = "SELECT * FROM accounts WHERE account_number = ? AND security_pin = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,security_pin);
                ResultSet rs = preparedStatement.executeQuery();
                if(rs.next()){
                    double current_balance = rs.getDouble("balance");
                    if(amount<=current_balance){
                        String query = "UPDATE accounts SET  balance = balance - ? WHERE account_number = ?";
                        PreparedStatement debitMoney = connection.prepareStatement(query);
                        debitMoney.setDouble(1,amount);
                        debitMoney.setLong(2,account_number);
                        int rowAffected = debitMoney.executeUpdate();
                        if(rowAffected>0){
                            System.out.println("RS " + amount + " Debited Successful");
                            connection.commit();
                            connection.setAutoCommit(true);
                            return;
                        }
                        else{
                            System.out.println("Transaction Failed!!!");
                            connection.rollback();
                            connection.setAutoCommit(true);
                        }
                    }
                    else{
                        System.out.println("Insufficient Balance!!!!!");
                    }
                }
                else {
                    System.out.println("Invalid Security Pin!!!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.setAutoCommit(true);
    }

    public void transfer_money(long sender_account_number) throws SQLException {
        scanner.nextLine();
        System.out.print("Enter Receiver Account Number : ");
        long receiver_account_number = scanner.nextLong();
        System.out.print("Enter Amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Security Pin : ");
        String security_pin = scanner.nextLine();

        try{
            connection.setAutoCommit(false);
            if(sender_account_number != 0 && receiver_account_number !=0)
            {
                String sql = "SELECT * FROM accounts where account_number = ? AND security_pin = ? ";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1,sender_account_number);
                preparedStatement.setString(2,security_pin);
                ResultSet rs = preparedStatement.executeQuery();
                if(rs.next()){
                    double current_balance = rs.getDouble("balance");
                    if(amount<=current_balance)
                    {
                        // sql query for debit and credit
                        String query_debit = "UPDATE accounts SET  balance = balance - ? WHERE account_number = ? ";
                        String query_credit = "UPDATE accounts SET  balance = balance + ? WHERE account_number = ? ";

                        // Prepared Statement for Debit and Credit
                        PreparedStatement debitStatement = connection.prepareStatement(query_debit);
                        PreparedStatement creditStatement = connection.prepareStatement(query_credit);

                        // Set values for queries
                        debitStatement.setDouble(1,amount);
                        debitStatement.setLong(2,sender_account_number);
                        creditStatement.setDouble(1,amount);
                        creditStatement.setLong(2,receiver_account_number);

                        int rowAffected1 = debitStatement.executeUpdate();
                        int rowAffected2 = creditStatement.executeUpdate();

                        if(rowAffected1 > 0 && rowAffected2 > 0)
                        {
                            System.out.println("Transaction Successful ");
                            System.out.println("Rs."+amount+" Transferred Successfully");
                            connection.commit();
                            connection.setAutoCommit(true);
                            return;
                        }
                        else {
                            System.out.println("Transaction Unsuccessful!!!!");
                            connection.rollback();
                            connection.setAutoCommit(true);
                        }

                    }else{
                        System.out.println("Insufficient Balance!!!");
                    }
                }
                else {
                    System.out.println("Invalid Security Pin!!!!");
                }
            }
            else {
                System.out.println("Invalid Account Number!!!");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        connection.setAutoCommit(true);
    }

    public void get_balance(long account_number)
    {
        scanner.nextLine();
        System.out.print("Enter Security pin : ");
        String security_pin = scanner.nextLine();

        if(account_number!=0)
        {
            try{
                String sql = "SELECT balance FROM accounts WHERE account_number = ? AND security_pin = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,security_pin);
                ResultSet rs = preparedStatement.executeQuery();
                if(rs.next())
                {
                    double balance = rs.getDouble("balance");
                    System.out.println(account_number + " Your Balance  : " + balance);
                }
                else {
                    System.out.println("Invalid Pin!!!!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
