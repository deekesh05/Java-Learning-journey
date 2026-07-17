public class Q02_Find_Element_In_2DArray {
    public static void main(String[] args) {
        // row and columns are Sorted
        //like
        // 1 4 7 11 15
        // 2 5 8 12 19
        // 3 6 9 16 22
        // 18 21 23 26 30
        // Rows are Sorted ---->
        // Columns are Sorted  |
        //                     v


        int [][]arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target  = 185;
        if(findElement(arr,target)){
            System.out.println("Element is in the array");
        }
        else
        {
            System.out.println("Element is not in array");
        }
    }
    static  boolean findElement(int[][] arr , int target)
    {
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int row = 0;
        int col = totalCols-1;
        while(row <totalRows && col >=0)
        {
            if(arr[row][col] == target){
                return true;
            } else if (arr[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}
