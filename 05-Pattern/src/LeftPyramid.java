import java.util.Scanner;

public class LeftPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows : ");
        int number = input.nextInt();
        for (int row = 1; row <= number; row++) // for next Row
        {
            for(int space = number-1;space>=row;space--)
            {
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
