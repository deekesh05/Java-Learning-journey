import java.util.Scanner;

public class NumberOfOccurrence {
    public static int numberOfOccurrence(int[] arr , int target )
    {
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,6,7,9,4};
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Target Number You Want to Search : ");
        int target = input.nextInt();
        int occurrence = numberOfOccurrence(arr,target);
        if(occurrence<1)
        {
            System.out.println("Target Number is not available in Array ");
        }
        else
        {
            System.out.println(" Number of Occurrence of " + target + " is : " + occurrence);

        }
    }
}
