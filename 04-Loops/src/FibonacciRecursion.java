import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int count = input.nextInt();
        if (count<=0)
        {
            System.out.println("Please Enter Valid Number ");
        }
        for (int i = 1; i <= count; i++) {
            System.out.print(fibonacci(i)+ "  ");
        }
    }
    public  static  int fibonacci(int position)
    {
        if(position == 1)
        {
            return 0;
        }
        if(position==2)
        {
            return 1;
        }
        return fibonacci(position-1)+fibonacci(position-2);
    }

}
