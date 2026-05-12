import java.util.Scanner;

public class CalculatorBySwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter 1st Number : ");
        int num1 = input.nextInt();
        System.out.print("Please Enter 2nd Number : ");
        int num2 = input.nextInt();
        System.out.print("Please Enter Expression (+,-,*,/) : ");
        String expression = input.next();
        switch (expression)
        {
            case "+" :
                System.out.println("Sum Of Number is " + (num1+num2));
                break;
            case "-" :
                System.out.println("Subtraction Of Number is " + (num1-num2));
                break;
            case "*":
                System.out.println("Multiplication Of Number is " + (num1*num2));
                break;
                case "/" :
                    if (num2 != 0) {
                        System.out.println("Division is : " + (double)(num1 / (double)num2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

            default:
                System.out.println("Please Enter Valid Expression");

        }
    }
}
