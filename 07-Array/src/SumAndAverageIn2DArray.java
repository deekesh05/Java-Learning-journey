public class SumAndAverageIn2DArray {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.takeInputIn2DArray();
        System.out.println("Sum of all elements of 2DArray " + sumOf2DArray(arr));
        System.out.println("Average of all elements of 2DArray " + averageOf2DArray(arr));

    }
    public static int sumOf2DArray(int[][] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static float averageOf2DArray(int[][] arr)
    {
    int sum = SumAndAverageIn2DArray.sumOf2DArray(arr);

    int totalElements = 0;

    for (int i = 0; i < arr.length; i++)
    {
        totalElements += arr[i].length;
    }

    return (float) sum / totalElements;
    }
}
