package Array.TWO_D_Array;

import java.util.ArrayList;

public class Q01_SumOfEachColumn {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int val : sumOfColumns(arr))
        {
            System.out.print(val + "  ");
        }
    }
    static ArrayList<Integer> sumOfColumns(int[][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int rowLength = arr.length;
        int cloLength = arr[0].length;
        for (int col = 0; col < rowLength; col++) {
            int sum = 0;
            for (int row = 0; row < cloLength; row++) {
                sum+=arr[row][col];
            }
            list.add(sum);
        }
        return list;
    }
}
