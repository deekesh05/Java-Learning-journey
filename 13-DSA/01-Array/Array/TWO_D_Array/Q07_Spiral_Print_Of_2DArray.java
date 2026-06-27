package Array.TWO_D_Array;

import java.util.ArrayList;

public class Q07_Spiral_Print_Of_2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        for(int val : printSpiral(arr))
        {
            System.out.print(val + " ");
        }
    }
    static ArrayList<Integer> printSpiral(int[][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int startRow = 0;
        int endRow = row-1;
        int startColumn = 0;
        int endColumn = col -1;


        while(startRow<=endRow && startColumn <=endColumn)
        {
        //print StartRow -> startColumn to endColumn
        for (int i = startColumn; i <= endColumn; i++) {
           list.add(arr[startRow][i]);

        }
            startRow++;
        //print EndColumn -> StartRow to End row
        for (int i = startRow; i <= endRow; i++) {
            list.add(arr[i][endColumn]);

        }
            endColumn--;

        if (startRow<=endRow){
            //print EndRow -> EndColumn to StartColumn
            for (int i = endColumn;i>=startColumn;i--) {
                list.add(arr[endRow][i]);

            }
            endRow--;
        }
       if (startColumn <=endColumn){
           //print StartColumn -> End Row to Start Row
           for (int i = endRow; i >= startRow; i--) {
               list.add(arr[i][startColumn]);
           }
           startColumn++;
       }

    }
        return list;
    }
}
