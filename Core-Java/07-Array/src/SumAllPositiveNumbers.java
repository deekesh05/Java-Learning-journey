public class SumAllPositiveNumbers {
    public static void main(String[] args) {
        int [] arr =  ArrayUtility.takeInput();
        ArrayUtility.printArray(arr);
        System.out.println("Print Sum of All Integers : " + sumOfPositive(arr));;

    }
    public static int sumOfPositive(int[]arr)
    {
        int sum=0;
        for(int val : arr)
        {
            if(val<0)
            {
                continue;
            }
            sum+=val;
        }
        return sum;
    }
}
