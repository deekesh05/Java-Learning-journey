public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {10,1,5,2,3};
        ArrayUtility.printArray(twoSum(arr,15));

    }
    static int[] twoSum(int[] nums,int target)
    {
        int n = nums.length;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++) {
                if(nums[i]+nums[j]== target)
                {
                    int arr[] = {nums[i],nums[j]};
                    return arr;
                }
            }
        }
        return new int[]{};
    }

}
