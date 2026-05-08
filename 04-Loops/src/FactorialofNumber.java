import java.util.Scanner;
public class FactorialofNumber {
     public static long fact(int n )
     {
         if (n < 2) {
             return 1;
         }
         long fact = 1;
         for (int i = 1; i <= n; i++) {
             fact*=i;
         }
         return fact;
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = input.nextInt();
        System.out.println("Factorial of " + number + " is " + fact(number));
    }
}
