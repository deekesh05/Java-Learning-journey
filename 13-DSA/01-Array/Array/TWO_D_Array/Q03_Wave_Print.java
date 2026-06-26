package Array.TWO_D_Array;

import java.util.ArrayList;

public class Q03_Wave_Print {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for(int val : wavePrint(arr))
        {
            System.out.print(val + " ");
        }

    }
    static ArrayList<Integer> wavePrint(int[][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int rowsLength = arr.length;
        int colLength = arr[0].length;
        for (int col = 0; col < colLength; col++) {
            if(col%2==0){
                for(int row = 0;row<rowsLength;row++)
                {
                    list.add(arr[row][col]);
                }
            }
            else{
                for (int row = rowsLength-1; row >= 0 ; row--) {
                    list.add(arr[row][col]);
                }
            }
        }
        return list;
    }
}
