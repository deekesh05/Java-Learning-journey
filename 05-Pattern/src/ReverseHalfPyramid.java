import java.util.Scanner;

public class ReverseHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows : ");
        int number = input.nextInt();
        for (int row = 1; row <= number; row++) // for next Row
        {
            for (int column = 5; column >=row; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
