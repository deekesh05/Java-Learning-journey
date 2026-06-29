import java.util.Scanner;

public class ValidNumberCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number : ");
        long num = input.nextLong();
        int checkvalid=0;
        if(checkvalid==1)
        {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invelid");
        }

    }
    public static long checkvalid(long n)
    {
        long digit;
        long sumofDigit=0;
        int countEven = 0;
        int countOdd = 0;
        while(n>0)
        {
            digit = n%10;
            if(digit%2==0)
            {
                countEven++;
            }
            else{
                countOdd++;
            }
            sumofDigit+=digit;
            n = n/10;
        }
        if (countOdd==countEven)
        {
            if(sumofDigit%3==0){
                return 1;
            }
        }
        return -1;
    }
}
