package Array.TWO_D_Array;

public class Q05_Rotate_2D_Array {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        ArrayUtility.print2DArray(rotate2DArray(arr));
    }
    static int[][] rotate2DArray(int[][] arr)
    {
        int rowLength = arr[0].length;
        int cloLength = arr.length;
        int[][] newArr = new int[rowLength][cloLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < cloLength; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        int[][] newArr2 = new  int[rowLength][cloLength];
        for (int i = 0; i < rowLength; i++) {
            int k = 0;
            for (int j = cloLength-1; j >=0 ; j--) {
                newArr2[i][k]=newArr[i][j];
                k++;
            }
        }

        return newArr2;

    }
}
