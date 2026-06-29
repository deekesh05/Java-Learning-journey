import java.util.Scanner;


public class GCD {


    public static int gcd(int num1,int num2){
        int i;
        int max=1;
        for (i = 2; i <= num1; i++) {
            if(num1%i==0 && num2%i==0)
            {

                if(max<i)
                {
                    max=i;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter 1st Number : ");
        int number1 = input.nextInt();
        System.out.print("Please Enter 2nd Number : ");
        int number2 = input.nextInt();
        int gcd = gcd(number1,number2);
        System.out.println("GCD of numbers : " + gcd);

    }
}
