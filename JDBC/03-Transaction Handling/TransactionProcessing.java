import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionProcessing {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Dk@8878545059";
        String withdraw  = "UPDATE accounts SET balance = balance - ? where account_number = ?";
        String deposit   = "UPDATE accounts SET balance = balance + ? where account_number = ?";

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
            try{
                PreparedStatement withdrawStatement = con.prepareStatement(withdraw);
                PreparedStatement depositStatement = con.prepareStatement(deposit);
                withdrawStatement.setDouble(1,500);
                withdrawStatement.setString(2,"account01");
                depositStatement.setDouble(1,500);
                depositStatement.setString(2,"account02");
                int withdrawExecuted = withdrawStatement.executeUpdate();
                int depositExecuted = depositStatement.executeUpdate();
                if(withdrawExecuted > 0 && depositExecuted >0){
                    con.commit();
                    System.out.println("Transaction Successful!!!");
                }else
                {
                    con.rollback();
                    System.out.println("Transaction Failed");
                }
            }catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
