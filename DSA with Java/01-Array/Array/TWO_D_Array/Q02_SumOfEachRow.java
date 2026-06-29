package Array.TWO_D_Array;

import java.util.ArrayList;

public class Q02_SumOfEachRow {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int val : sumOfRows(arr))
        {
            System.out.print(val + "  ");
        }


    }
    static ArrayList<Integer> sumOfRows(int[][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int rowsLength = arr.length;
        int colLength = arr[0].length;
        for (int i = 0; i < rowsLength; i++) {
            int sum = 0;
            for (int j = 0; j < colLength; j++) {
                sum+=arr[i][j];
            }
            list.add(sum);
        }
        return list;
    }
}
