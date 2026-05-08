import java.util.Scanner;

public class SumOfDigits {
    public static int sumofdigits(int number)
    {
        int sum = 0;
        int n = 0;
        while(number>0)
        {
            n = number%10;
            sum+=n;
            number = number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = input.nextInt();

        System.out.println("Sum of digits in " + number + " is " + sumofdigits(number));

    }
}
