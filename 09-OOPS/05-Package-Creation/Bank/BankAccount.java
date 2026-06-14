package Bank;

class BankAccount {
    private long accountNumber;
    private  String accountHolderName;
    private  double accountBalance;

    public BankAccount(long accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void Deposite(double amount)
    {
        accountBalance+=amount;
        System.out.println("Deposit Success of "+ amount + "Total Balance : " + accountBalance);
    }
    public  void withdraw(double amount)
    {
        if(accountBalance<amount)
        {
            System.out.println("You Have Insuffient Balance ");
            return;
        }
        else
        {
            accountBalance -= amount;
            System.out.println("Withdraw Successful of " + amount + " Account Balance : " + accountBalance);
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1245,"Deekesh",100000);
        bankAccount.Deposite(25000);
        bankAccount.withdraw(65000);
    }
}
