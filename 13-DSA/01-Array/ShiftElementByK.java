import java.util.Scanner;

public class ShiftElementByK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int k = input.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8};
        ArrayUtility.printArray(shiftElement(arr , k));

    }
    static int[] shiftElement(int[]arr ,int k)
    {
        if (k==0)
        {
            return arr;
        }
        int size = arr.length-1;
        int[] newArr = new int[k];
        int i = 0;
        int j = size-k+1;
        while(i<k)
        {
            newArr[i] = arr[j];
            i++;
            j++;
        }

        int [] newArr2 = new int[arr.length];
            int index = 0;
        for(int m = 0;m< k;m++)
        {
            newArr2[index++]=newArr[m];
        }
        for (int l = 0; l < arr.length-k; l++) {
            newArr2[index++] = arr[l];
        }
        return newArr2;
    }
}
