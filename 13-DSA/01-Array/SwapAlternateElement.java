public class SwapAlternateElement {
    public static void main(String[] args) {
        int [] arr = {1,2,5,7,6,8,9,4,2,10};
        ArrayUtility.printArray(swapAlternates(arr));

    }
    static int[] swapAlternates(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
