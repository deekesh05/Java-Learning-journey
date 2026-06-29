public class Q02_Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {2,5,7,1,6,10,9,7};
        ArrayUtility.printArray(selectionSort(arr));
    }
    static int[] selectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j =i+1; j < n; j++) {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;


        }
        return arr;
    }

}
