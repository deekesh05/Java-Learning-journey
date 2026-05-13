import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass = "Deekesh";
        String password;
        do {
            System.out.println("Please Enter Password ");
            password = input.nextLine();
        }
        while(!pass.equals(password));
        {
            System.out.println("so your Password is " + (password));

        }

    }
}
