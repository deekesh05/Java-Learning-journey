import java.util.Scanner;

public class DeleteSpecificElement {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.takeInput();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number you want to Delete : ");
        int target = input.nextInt();
        int[] newarr = deleteElement(arr,target);
        ArrayUtility.printArray(newarr);
    }
    public static int[] deleteElement(int[] arr , int target)
    {
        int count = NumberOfOccurrence.numberOfOccurrence(arr,target);
        int size = arr.length-count;
        int[] newarr = new int[size];
        int i=0,j=0;
        while(i<arr.length)
        {
            if(arr[i]!=target)
            {
                newarr[j]=arr[i];
                j++;
            }
            i++;
        }
        return newarr;
    }
}
