import java.util.Scanner;

public class DetermineEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter a Number : ");
        int number = input.nextInt();
        if (number % 2 == 0 && number !=0) {
            System.out.println(number + " is Even");
        } else if (number == 0) {
            System.out.println("Please Enter Valid Number");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
