package ArrayOperation;

public class ArrayOperation {
    protected static class Statistic{
        int sum (int[] arr)
        {
            int sum = 0;
            for(int val: arr){
                sum+=val;
            }
            return sum;
        }
        int mean(int[] arr )
        {
            return sum(arr)/ arr.length;
        }
        int median(int[] arr){

            return 0;
        }
    }
}
