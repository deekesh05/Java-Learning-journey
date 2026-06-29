import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        int random = (int)(Math.random()*10)+1;
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println(random);
        do {
            System.out.print("Guess any number from 1 to 10 :  ");
            number = input.nextInt();
        }
        while(random != number);{
            System.out.print("You Guess Right Number ");
        }
    }
}
