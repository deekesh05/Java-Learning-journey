public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivot(arr));
    }
    static int pivot(int[] arr){
        int n = arr.length;
        int[] sumOfLeft = new int[n];
        int[] sumOfRight = new int[n];

        sumOfLeft[0] = arr[0];
        for(int i = 1;i<n;i++)
        {
            sumOfLeft[i] = arr[i] + sumOfLeft[i-1];
        }

        sumOfRight[n-1] = arr[n-1];
        for(int i  = n-2;i>0;i--)
        {
            sumOfRight[i] = arr[i] + sumOfRight[i+1];
        }
        for (int i = 0; i < n; i++) {
            if(sumOfLeft[i]==sumOfRight[i])
            {
                return i;
            }
        }
        return -1;
    }
}
