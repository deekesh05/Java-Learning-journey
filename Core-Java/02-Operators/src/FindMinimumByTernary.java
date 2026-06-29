import java.util.Scanner;

public class FindMinimumByTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 1st Number : ");
        int num1 = input.nextInt();
        System.out.println("Please Enter 2nd Number : ");
        int num2 = input.nextInt();
        int minimum = num1<num2 ? num1:num2;
        System.out.println(minimum + " is a minimum Number ");
    }
}
