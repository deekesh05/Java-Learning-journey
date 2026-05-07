import java.util.Scanner;

public class CalculateGradesByNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter a Marks : ");
        float marks = input.nextFloat();
        if (marks > 100 ){
            System.out.println("Please enter valid Marks ");
        }
        else{
            if(marks>=90 && marks<=100){
                System.out.println("A Grade");
            }
            else  if(marks<=75){
                System.out.println("B Grade");
            } else if (marks<=60) {
                System.out.println("C Grade");
            } else if (marks<=30) {
                System.out.println("D Grade");
            }
            else {
                System.out.println("Fail");
            }
        }

    }
}
