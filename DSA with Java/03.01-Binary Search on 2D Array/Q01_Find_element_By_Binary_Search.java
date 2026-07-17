public class Q01_Find_element_By_Binary_Search {
    public static void main(String[] args) {
        int arr [][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target  = 16;
        if(findElement(arr,target)){
            System.out.println("Element is in the array");
        }
        else
        {
            System.out.println("Element is not in array");
        }
    }
    static boolean findElement(int[][] arr,int target)
    {
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        int start = 0;
        int n = totalRows*totalCols;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int row = mid/totalCols;
            int col = mid%totalCols;

            if(arr[row][col] == target)
            {
                return true;
            } else if (arr[row][col]<target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }
}
