import java.util.Scanner;

public class FunctionOverloading {

    // Sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum of two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // Sum of three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 Integers : " + sum(10, 20));

        System.out.println("Sum of 2 Doubles : " + sum(10.5, 20.5));

        System.out.println("Sum of 3 Integers : " + sum(10, 20, 30));
    }
}