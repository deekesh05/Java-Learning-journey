import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = input.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        if(number <=1)
        {
            System.out.println(first+ " ");
        }
        else if(number==2){
            System.out.println(first + " "+ second);
        }
        else {
            System.out.print( first + " " + second + "  ");
            for (int i = 3; i <= number; i++) {
                third = first+second;
                System.out.print(third + " ");
                first = second;
                second = third;
            }
        }

    }

}
