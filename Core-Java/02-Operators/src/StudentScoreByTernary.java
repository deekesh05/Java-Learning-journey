import java.util.Scanner;

public class StudentScoreByTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Score : ");
        int score = input.nextInt();
        String str = (score>=80 && score<=100)?"High Score":
                (score>=50)?"Moderate":
                        "Low";
        System.out.println(str);
    }
}
