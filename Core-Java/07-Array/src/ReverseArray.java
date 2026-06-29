public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.takeInput();
        System.out.println("Array length : "+ arr.length);
        ArrayUtility.printArray(arr);
        System.out.println("Print Array By While And Swaping");
        int[] newarr = reverseArray(arr);
        ArrayUtility.printArray(newarr);
        System.out.println("Print Array By For Loop");
        int[] arrByForLoop = reverseArrayByForLoop(arr);
        ArrayUtility.printArray(arrByForLoop);

    }
    public  static  int[] reverseArray(int[]arr)
    {
        int size = arr.length;

        int start = 0;

        int end = size-1;
        while (start<end)
        {
           int temp = arr[start];
           arr[start]= arr[end];
           arr[end]=temp;
           start++;
           end--;

        }

        return arr;
    }
    public  static  int[] reverseArrayByForLoop(int[]arr)
    {
        int size = arr.length;
        int[] newarr = new int[size];
        int i=size-1;
        int j=0;
        while (i>=0)
        {
            newarr[j]=arr[i];
            i--;
            j++;
        }
        return newarr;
    }
}
