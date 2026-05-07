import java.util.Scanner;

public class GreastestOfThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter 1st Number : ");
        int number1 = input.nextInt();

        System.out.printf("Please Enter 2nd Number : ");
        int number2 = input.nextInt();

        System.out.printf("Please Enter 3rd Number : ");
        int number3 = input.nextInt();

        // Check if Numbers Are Equal
        if(number1==number2 && number2 == number3){
            System.out.println("All Numbers are equal");
        } else if (number1==number2) {
            System.out.println("number 1 and number 2  are equal");
        } else if (number1==number3) {
            System.out.println("number 1  and  number 3  are equal");
        } else if (number2==number3) {
            System.out.println("number 2  and number 3  are equal");
        }
        else {
            System.out.println("Numbers are not equal so check which is greatest");
        }

            //Check Greatest Number
            if (number1>=number2 && number1>=number3){
                System.out.println(number1 + " Is greatest Number");
            }
            else  if (number2>=number1 && number2>=number3){
                System.out.println(number2 + " Is greatest Number");
            }
            else {
                System.out.println(number3 + " Is greatest Number");
            }
        }

    }

