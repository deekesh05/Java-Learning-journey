public class Q11_Find_Element_In_Nearly_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {10,30,20,50,40,70,60,80};
        int element  = 10;
        System.out.println("Index of element : " + findElementInNearlySorted(arr,element));
    }
    static int findElementInNearlySorted(int [] arr, int target)
    {
        int start = 0;
        int n = arr.length;
        int end = n-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if (mid-1 >= 0 && arr[mid-1]==target) {
                return mid-1;
            }
            else if (mid+1 < n && arr[mid+1]==target) {
                return mid+1;
            }
            else if (arr[mid]<target) {
                start = mid+2;
            }
            else {
                end = mid-2;
            }
        }

        return -1;
    }
}
