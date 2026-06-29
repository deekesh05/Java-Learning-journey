public class SumAndAverageOfArrayElements {
    //Function For Sum OF Array
    public  static  void sumOfArray(int[] arr)
    {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of array is : " + sum);
    }
    //Function For Average OF Array
    public  static  void averageOfArray(int[] arr)
    {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Average of array is : " + sum/ arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,6,7,9,4};
        System.out.println("Size of array  : " + arr.length);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        sumOfArray(arr);
        averageOfArray(arr);

    }
}
