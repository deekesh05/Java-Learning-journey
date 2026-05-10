import java.util.Scanner;

public class ReverseNumberFunction {

    // Function to reverse number
    public static int reverseNumber(int number) {

        int reverse = 0;

        while (number > 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int number = input.nextInt();

        int result = reverseNumber(number);

        System.out.println("Reverse Number = " + result);
    }
}