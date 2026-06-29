import java.util.Scanner;

public class CheckPalindrome {
//    Function for Check Palindrome
    public static boolean checkpelindrome(int number)
    {
        int temp = number;
        int rev = 0;
        int digits = 0;
        while(number>0)
        {
            digits = number%10;
            rev = 10*rev+digits;
            number/=10;
        }
        if(rev==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = input.nextInt();
        boolean palindrome = checkpelindrome(number);
        if(palindrome){
            System.out.println(number + " is a Palindrome");
        }
        else {
            System.out.println(number + " is Not a Palindrome");
        }
    }
}
