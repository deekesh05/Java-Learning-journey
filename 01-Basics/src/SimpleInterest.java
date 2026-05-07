import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter Amount : ");
        float p = input.nextFloat();
        System.out.printf("Please Enter Time in years: ");
        float t = input.nextFloat();
        System.out.printf("Please Enter Interest Rate : ");
        float r = input.nextFloat();
        float si = (p*t*r)/100;
        System.out.println("Simple Interset of Amount " + p + " in " + t +" years " + si);
        System.out.println("So Total Amount is : " + (si+p));
    }
}
