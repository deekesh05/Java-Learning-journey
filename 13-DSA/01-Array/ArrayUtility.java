import java.util.Scanner;

public class ArrayUtility {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to take input in array
    public static int[] takeInput() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");

        int size = input.nextInt();

        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Array Element " +(i+1) + " : "  );
            arr[i] = input.nextInt();
        }
        System.out.println();
        return arr;
    }
    public static int[][] takeInputIn2DArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows of Array : ");
        int row = input.nextInt();
        System.out.print("Enter column of Array : ");
        int column = input.nextInt();

        int[][] arr = new int[row][column];


        for (int i = 0; i < row; i++) {
            for(int j=0;j<column;j++)
            {
                System.out.print("Enter Array Element " +i +" "+j + " : "  );
                arr[i][j] = input.nextInt();
            }

        }
        System.out.println();
        return arr;
    }


}
