import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows : ");
        int number = input.nextInt();
        int count = 1;
        for (int row = 1; row <= number; row++) // for next Row
        {
            for (int column = 1; column <= row; column++) {

                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
