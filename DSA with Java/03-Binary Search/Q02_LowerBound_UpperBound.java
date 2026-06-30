public class Q02_LowerBound_UpperBound {
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,30,30,40,50};
        System.out.println(lowerBound(arr,30));
        System.out.println(upperBound(arr,30));
    }
    static int lowerBound(int[] arr,int target)
    {
        int n = arr.length;
        int st = 0;
        int end = n-1;

        int ans = n;
        while(st<=end)
        {
            int mid = st + end-st/2;
            if(arr[mid]>=target)
            {
                ans = mid;
                end = mid-1;
            }
            else{
                st =mid+1;
            }
        }
        return ans;
    }
    static int upperBound(int[] arr,int target)
    {
        int n = arr.length;
        int st = 0;
        int end = n-1;
        int ans = n;
       while(st<=end)
       {
           int mid = st + end-st/2;
           if(arr[mid]<=target)
           {
               st = mid+1;

           }else
           {
               ans = mid;
               end=mid-1;
           }
       }
       return ans;
    }
}
