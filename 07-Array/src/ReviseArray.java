public class ReviseArray {
    public static void main(String[] args) {
    int[] arr = ArrayUtility.takeInput();
    ArrayUtility.printArray(arr);
        System.out.println(sumOfArray(arr));
        System.out.println(avgOfArray(arr));
        System.out.println(largestElement(arr));
        System.out.println(smallestElement(arr));

    }
    public static int sumOfArray(int[] arr)
    {
        int sum = 0;
        for(int val : arr)
        {
            sum+=val;
        }
        return sum;
    }
    public static int avgOfArray(int[] arr)
    {
        return sumOfArray(arr)/arr.length;
    }
    public static int largestElement(int[] arr)
    {
        int large = Integer.MIN_VALUE;
        for(int val : arr)
        {
            if(large<val)
            {
                large = val;
            }
        }
        return large;
    }
    public static int smallestElement(int[] arr)
    {
        int small = Integer.MAX_VALUE;
        for(int val : arr)
        {
            if(small>val)
            {
                small = val;
            }
        }
        return small;
    }

}
