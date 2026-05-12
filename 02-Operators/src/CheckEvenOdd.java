import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = input.nextInt();
        String str = number%2==0 ? number+" is even ": number +" is odd";
        System.out.println(str);
    }
}
