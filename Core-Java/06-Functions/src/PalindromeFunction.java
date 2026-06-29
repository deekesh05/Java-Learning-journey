import java.util.Scanner;

public class PalindromeFunction {

    // Function to check palindrome number
    public static boolean isPalindrome(int number) {

        int temp = number;
        int reverse = 0;

        while (number > 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number /= 10;
        }

        return temp == reverse;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int number = input.nextInt();

        if (isPalindrome(number)) {

            System.out.println(number + " is a Palindrome Number");

        } else {

            System.out.println(number + " is not a Palindrome Number");
        }
    }
}