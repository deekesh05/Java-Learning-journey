import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

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
            Scanner scanner = new Scanner(System.in);
            User user = new User(connection,scanner);
            Accounts accounts = new Accounts(connection,scanner);
            AccountManager accountManager = new AccountManager(connection,scanner);

            String email ;
            long account_number;

            while(true){
                System.out.println("*** WELCOME TO BANKING SYSTEM ****");
                System.out.println();
                System.out.println("1. Register ");
                System.out.println("2. Login ");
                System.out.println("3. Exit");
                System.out.println();
                System.out.print("** Enter Your Choice : ");
                int choice1 = scanner.nextInt();
                switch(choice1)
                {
                    case 1 :
                        user.register();
                        break;
                    case 2 :
                        email = user.login();
                        if(email!=null)
                        {
                            System.out.println("User Logged In!!!");
                            if(!accounts.account_exists(email))
                            {
                                System.out.println();
                                System.out.println("1. Open New Bank Account !!");
                                System.out.println("2. Exit!!");
                                System.out.print("Choose One : ");
                                int choice2 = scanner.nextInt();
                                if(choice2==1)
                                {
                                    account_number = accounts.open_account(email);
                                    System.out.println("Account Created Successfully !!!!");
                                    System.out.println("Your Account Number is : " + account_number);
                                }
                                else
                                {
                                    break;
                                }
                            }
                            account_number = accounts.getAccountNumber(email);
                            int choice3  = 0;
                            while (choice3 !=5)
                            {
                                System.out.println();
                                System.out.println("1. Debit Money");
                                System.out.println("2. Credit Money");
                                System.out.println("3. Transfer Money");
                                System.out.println("4. Check Balance");
                                System.out.println("5. Log Out");
                                System.out.print("Enter your choice: ");
                                choice3 = scanner.nextInt();
                                switch(choice3)
                                {
                                    case 1 :
                                        accountManager.debit_money(account_number);
                                        break;
                                    case 2:
                                        accountManager.credit_money(account_number);
                                        break;
                                    case 3 :
                                        accountManager.transfer_money(account_number);
                                        break;
                                    case 4:
                                        accountManager.get_balance(account_number);
                                        break;
                                    case 5:
                                        break;
                                    default :
                                        System.out.println("Enter Valid Choice !!!!");
                                        break;
                                }
                            }
                        }
                        else{
                            System.out.println("Incorrect Email or Password!");
                        }
                        break;
                    case 3 :
                        System.out.println("THANK YOU FOR USING BANKING SYSTEM!!!");
                        System.out.println("Exiting System!");
                        return;
                    default:
                        System.out.println("Enter Valid Choice");
                        break;
                }
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
