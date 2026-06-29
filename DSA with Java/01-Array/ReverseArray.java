public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,9,7,8,6,10};
        ArrayUtility.printArray(reverseElement(arr));
    }
    static int[] reverseElement(int[] arr)
    {
        int i = 0;
        int j = arr.length-1;
        while (i<=j)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
