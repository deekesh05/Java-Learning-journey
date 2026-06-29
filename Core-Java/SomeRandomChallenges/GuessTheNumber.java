import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)Math.ceil(Math.random() * 10);
            int guess;
        do {
            System.out.println("Guess Number From 1 to 10 : ");
            guess = input.nextInt();
        }
        while(num!=guess);
        {
                System.out.println("You Guessed Right Number ");

        }


    }
}
