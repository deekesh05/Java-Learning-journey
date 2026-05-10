public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.takeInput();
        int[] arr2 = ArrayUtility.takeInput();
        mergeArray(arr1,arr2);
    }
    public static void mergeArray(int[]arr1,int[]arr2)
    {
        int[] newarr = new int[arr1.length + arr2.length];
        int i =0 ,j=0,k=0;
        while(i< arr1.length && j< arr2.length) {
            if (arr1[i] < arr2[j]) {
                newarr[k] = arr1[i];
                i++;
                k++;
            } else {
                newarr[k] = arr2[j];
                j++;
                k++;
            }
        }
            while (i< arr1.length)
            {
                newarr[k]=arr1[i];
                i++;
                k++;
            }
            while (j< arr2.length)
            {
                newarr[k]=arr2[j];
                j++;
                k++;
            }

        ArrayUtility.printArray(newarr);
    }
}
