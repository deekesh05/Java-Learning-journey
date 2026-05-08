import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows : ");
        int number = input.nextInt();
        for (int i = 1; i <= number ; i++) {
            for(int k = number-i;k>=1;k--)
            {
                System.out.print("  ");
            }
            for(int j = 1;j<=i*2-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
