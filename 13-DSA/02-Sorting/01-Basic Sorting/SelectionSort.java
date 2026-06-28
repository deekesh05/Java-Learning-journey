public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,6,8,9,1};
        ArrayUtility.printArray(selectionSort(arr));
    }
    static int[] selectionSort(int [] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
