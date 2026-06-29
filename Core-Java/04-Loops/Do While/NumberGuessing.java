import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 7;
        int number;
        do {
            System.out.println("Guess Number From 1 to 10 :  ");
            number = input.nextInt();
        }
        while(number!=num);
        {
            System.out.println("so the Number  is " + number);
        }

    }
}
