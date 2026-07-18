import java.util.Scanner;

public class Q03_Find_Index_Of_Maximum_1s {
    public static void main(String[] args) {
        int [][] arr = {{0,0,0,0,0},{0,0,0,1,1},{0,0,1,1,1},{1,1,1,1,1},{0,1,1,1,1}};

        System.out.println("Maximum 1s Occurrence Row Index : " + findMaximumOnesOccurrence(arr));
    }
    static int firstOccurrenceIndex(int [][] arr , int rowIndex)
    {
        int totalRows = arr.length;
        int totalCol = arr[0].length;
        int start = 0;
        int end = totalCol-1;
        int ans = -1;
        if(arr[rowIndex][totalCol-1] == 0)
        {
            return totalCol;
        }else {


            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[rowIndex][mid] == 0) {
                    start = mid + 1;
                }
                else{
                    ans = mid;
                    end = mid-1;
                }
            }
        }
        return ans;
    }
    static  int findMaximumOnesOccurrence(int [][] arr)
    {
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        int maxi = -1;
        int maxOnesRowIndex = -1;
        for (int row = 0; row < totalRows; row++) {
            int colIndex = firstOccurrenceIndex(arr,row);
            int totalCount = totalCols - colIndex;
            if(totalCount !=0 && totalCount > maxi)
            {
                maxi = totalCount;
                maxOnesRowIndex = row;
            }
        }
        return maxOnesRowIndex;
    }
}
