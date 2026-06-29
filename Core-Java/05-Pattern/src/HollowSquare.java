import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j=1;j<=number;j++)
            {
                if(i==1 || i==number || j==1 ||j==number)
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
