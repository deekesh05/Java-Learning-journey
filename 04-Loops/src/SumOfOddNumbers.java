import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = input.nextInt();
        int sum = 0 ;
        for(int i = 0;i<=number;i++){
            if(i%2!=0){
//                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("Sum of all odd numbers from 1 to " + number + " is " + sum);
    }
}
