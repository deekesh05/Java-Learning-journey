import java.util.Scanner;

public class TakingInputInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
//        Taking Input By User For Array

        for(int i = 0;i< arr.length;i++)
        {
            System.out.print("please enter " + i +" Element : ");
            arr[i] = input.nextInt();
        }
//        Traversing in Array
        System.out.println("Normal Printing Array Elements ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();

//        Enhanced For Loop for array
        System.out.println("Use Enhanced for loop for Array Elements ");

        for(int i : arr)
        {
            System.out.print(i + "  ");
        }

    }
}
