public class MaximumAndMinimumElement {
    public static int maxElement(int[] arr)
    {
        // For Maximum Element In Array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public  static  int maxElementByForeach(int [] arr)
    {
        int max=-1;
        for(int val : arr)
        {
            if(max<val)
            {
                max=val;
            }
        }
        return max;
    }
    public static int minimumElement(int[] arr)
    {
        // For Minimum Element In Array
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,6,7,9,4};
        for(int i : arr)
        {
            System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("Maximum Number in Array :"+ maxElementByForeach(arr) );
        System.out.println("Maximum Number in Array :"+ maxElement(arr) );
        System.out.println("Minimum Number in Array :"+ minimumElement(arr));


    }
}
