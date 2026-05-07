import java.util.Scanner;

public class ProductOfTwoFloatingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please Enter 1st Floating Number : ");
        float a = scanner.nextFloat();
//        System.out.println();
        System.out.printf("Please Enter 2nd Floating Number : ");
        float b = scanner.nextFloat();
        System.out.println("Product of Floating Numbers : " +a*b);
    }
}
