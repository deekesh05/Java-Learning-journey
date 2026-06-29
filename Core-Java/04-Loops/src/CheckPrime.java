import java.util.Scanner;

public class CheckPrime {
    public static  boolean checkPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i < num/2; i++) {
            if (num%i==0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = input.nextInt();
        boolean checkPrime = checkPrime(number);
        if(checkPrime){
            System.out.println(number + " is a Prime Number ");
        }
        else{
            System.out.println(number + " is not a Prime Number ");
        }


        }

}
