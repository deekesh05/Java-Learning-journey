import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = input.nextInt();
        System.out.print("Table of " + number + " :  ");
        for(int i = 1;i<=10;i++){
            System.out.print(number*i + "  ");
        }
    }
}
