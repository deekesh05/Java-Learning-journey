import java.util.Scanner;

public class SumOfDigitsFunction {

    // Function to calculate sum of digits
    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            sum += digit;

            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int number = input.nextInt();

        int result = sumOfDigits(number);

        System.out.println("Sum of Digits = " + result);
    }
}