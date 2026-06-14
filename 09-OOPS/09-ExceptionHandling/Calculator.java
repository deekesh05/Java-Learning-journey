import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1st number : ");
        int number1 = input.nextInt();
        System.out.print("Please enter 2nd Number : ");
        int number2 = input.nextInt();
        try {
            double result = number1 /number2;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("divided by 0 Please enter other numbers then 0");
        }
    }
}
