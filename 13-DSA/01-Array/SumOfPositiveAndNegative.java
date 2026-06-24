public class SumOfPositiveAndNegative {
    public static void main(String[] args) {
        int[] arr =  ArrayUtility.takeInput();
        sumOfPositiveAndNegative(arr);
    }
    static  void sumOfPositiveAndNegative(int[] arr)
    {
        int size = arr.length;
        double sumOfPositive = 0;
        double sumOfNegative = 0;
        for(int i = 0;i<size;i++)
        {
            if(arr[i]<0)
            {
                sumOfNegative+=arr[i];
            }
            else
            {
                sumOfPositive+=arr[i];
            }
        }
        System.out.println("Sum of positive Numbers : " + sumOfPositive );
        System.out.println("Sum of Negative Numbers : " + sumOfNegative);
    }
}
