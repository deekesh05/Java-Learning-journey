import java.util.Scanner;

public class Patterns {

    public static void normalPattern(int number){
        for(int i = 0;i<number;i++)
        {
            for (int j = 0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public  static  void reversePattern(int number){
        for(int i = number-1;i>=0;i--)
        {
            for (int j = 0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows : ");
        int number = input.nextInt();
//        normalPattern(number);
//        System.out.println();
//        System.out.println();
       for(int i = 1;i<=number;i++){  //for next Line
           for(int j = 1;j<=number-i;j++) // for Spaces
           {
               System.out.print("  ");
           }

           for(int j = 1;j<=i;j++){
               System.out.print("* ");
           }

           System.out.println();
       }

    }
}
