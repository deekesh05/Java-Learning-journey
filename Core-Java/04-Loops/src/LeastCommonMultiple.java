import java.util.Scanner;

public class LeastCommonMultiple {

    public static int lcm(int number1,int number2){
        for (int i = 2; i <= (number1*number2); i++) {
            if(i%number1==0 && i%number2==0)
            {
                return i;
            }
        }
        return -1;
    }
     
    //Second Aproach 
    public static int lcm2(int number1,int number2) {
        for (int i = 1; i < number2; i++) {
            int factor = number1 * i;
            if(factor%number2==0)
            {
                return factor;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter 1st Number : ");
        int number1 = input.nextInt();
        System.out.print("Please Enter 2nd Number : ");
        int number2 = input.nextInt();

        int lcm = lcm(number1,number2);
        System.out.println("Least Common Multiple of " + number1 + " and "+ number2 + " is : " + lcm);

        int lcm2 = lcm2(number1,number2);
        System.out.println("Least Common Multiple of " + number1 + " and "+ number2 + " is : " + lcm2);
        
    }
}
