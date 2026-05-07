import java.util.Scanner;

public class DetermineNumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter a Number : ");
        int number = input.nextInt();
        if(number>0){
            System.out.println(number + " is Positive");
        } else if (number==0) {
            System.out.println(number + " is Zero");

        }
        else {
            System.out.println(number + " is Negative");

        }
    }
}
