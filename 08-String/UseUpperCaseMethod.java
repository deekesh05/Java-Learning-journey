import java.util.Scanner;

public class UseUpperCaseMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter First String : ");
        String first = input.next();
        System.out.print("Please Enter Second String : ");
        String Second = input.next();
        System.out.printf("Concatenated Strings : %S %S" , first ,Second);
        // We can Also use toUppercase method
    }
}
