import java.util.Scanner;

public class FactorialFunction {

    // Function to calculate factorial
    public static int factorial(int number) {

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int number = input.nextInt();

        int result = factorial(number);

        System.out.println("Factorial = " + result);
    }
}