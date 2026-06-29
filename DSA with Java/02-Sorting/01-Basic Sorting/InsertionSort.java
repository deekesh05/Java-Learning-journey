public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,6,7,8,1};
        ArrayUtility.printArray(selectionSort(arr));
    }
    static int[] selectionSort(int [] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int previous = i-1;
            while(previous >=0 && current < arr[previous])
            {
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
        return arr;
    }
}
