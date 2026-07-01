public class Q03_Mountain_Element {
    public static void main(String[] args) {
        int [] arr = {1,3,5,4,2};
        System.out.println(mountainElement(arr));
    }
    static  int mountainElement(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = arr[0];
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            //if arr[mid]>= arr[mid+1] then got to left side
            if(arr[mid]>=arr[mid+1])
            {
                ans =mid;
                end = mid-1;
            }
            //if arr[mid]<arr[mid+1]
            else
            {
                start = mid+1;
            }
        }
        return ans+1;
    }
}
