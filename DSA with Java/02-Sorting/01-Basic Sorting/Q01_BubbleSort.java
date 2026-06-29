public class Q01_BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,5,7,1,6,10,9,7};
        ArrayUtility.printArray(bubbleSort(arr));
    }
    static int[] bubbleSort(int[] arr)
    {
        int n = arr.length;
        //Rounds
        for (int i = 0; i < n; i++) {
            //iteration
            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
