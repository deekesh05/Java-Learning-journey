public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ArrayUtility.printArray(threeSum(arr,0));
    }
    static int[] threeSum(int[] nums,int target)
    {
        int n = nums.length;
        for (int i = 0; i < n-2; i++){
            for (int j = i+1; j < n-1; j++) {
                for (int k = 0; k < n; k++) {
                    if(nums[i]+nums[j]+nums[k] == target)
                    {
                        int arr[] = {nums[i],nums[j],nums[k]};
                        return arr;
                    }
                }

            }
        }
        return new int[]{};
    }
}
