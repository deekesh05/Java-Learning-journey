package Array.TWO_D_Array;

public class Q06_Rotate_2D_Array_Same_Matrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayUtility.print2DArray(rotateArray(arr));

    }
    static int[][] rotateArray(int[][] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n-1;
            while(start<end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }
}
