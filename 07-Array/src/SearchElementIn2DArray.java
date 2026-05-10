import java.util.Scanner;

public class SearchElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.takeInputIn2DArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Target Number : ");
        int target = input.nextInt();
        if(searchElement(arr,target))
        {
            System.out.println("Valve is Present  ");
        }
        else
        {
            System.out.println("Value is not Present ");
        }
    }
    public static boolean searchElement(int[][] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j< arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    System.out.println("index is " +i+""+j );
                    return true;
                }
            }
        }
        return false;
    }
}
