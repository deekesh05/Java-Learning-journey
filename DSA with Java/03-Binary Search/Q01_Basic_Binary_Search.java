import java.util.Scanner;

public class Q01_Basic_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,9,10,13,25};
        ArrayUtility.printArray(arr);
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Target : " );
        int target = input.nextInt();
        System.out.println("Index of target : " + binarySearch(arr,target));
    }
    static int binarySearch(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;
        // mid = start+end/2;
        int mid = start + (end-start)/2;
        while(start<=end)
        {
            if(arr[mid]==target)
            {
                return mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
}
