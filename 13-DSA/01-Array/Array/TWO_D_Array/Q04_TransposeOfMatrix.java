package Array.TWO_D_Array;

public class Q04_TransposeOfMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(arr.length);
        ArrayUtility.print2DArray(arr);
        ArrayUtility.print2DArray(transpose(arr));
    }

    static int[][] transpose(int[][] arr)
    {
         int rowLength = arr.length;
         int colLength = arr[0].length;
         int newRowLength = colLength;
         int newColLength = rowLength;
        int [][] newArr = new int [newRowLength][newColLength];
        for (int row = 0; row < newRowLength; row++) {
            for (int col = 0; col < newColLength; col++) {
                newArr[row][col] = arr[col][row];
            }
        }
        return newArr;
    }
}
