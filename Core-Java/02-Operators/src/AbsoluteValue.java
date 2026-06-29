import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = input.nextInt();
        int absNumber = number<0 ? number*(-1):number;
        System.out.println(absNumber);

    }
}
