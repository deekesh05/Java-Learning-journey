import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter a Year : ");
        int year = input.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0)
        {
            System.out.println(year + " is a leap Year");
        }
        else {
            System.out.println(year + " is Not a leap year ");
        }
        input.close();
    }
}
