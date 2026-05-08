import java.util.Scanner;

public class CheckArmstrong {
//    Function for Check Armstrong
    public static  boolean checkarm(int number ){
        int temp = number;
        int digits = 0;
        int power = 0;
        int arm = 0;
        if(number==1){
            return true;
        }
        // Count digits
        int count = 0;
        int copy = number;

        while (copy > 0) {
            count++;
            copy /= 10;
        }


        while(number>0){
            digits = number%10;
            power = (int)Math.pow(digits,count);
            arm +=power;
            number/=10;
        }
        if(temp==arm){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = input.nextInt();
        if (checkarm(number)){
            System.out.println(number + " is a Armstrong Number  ");
        }
        else {
            System.out.println(number + " is not a Armstrong Number  ");

        }
    }
}
