//Kadane's Algorithm
public class Q18_Maximum_Sub_Array_LC53 {
    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {5,4,-1,7,8};
        System.out.println("Maximum of subArrays " + maximumSub(arr));
    }
    static int maximumSub(int[]arr){
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum>maxi)
            {
                maxi = sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxi;
    }
}