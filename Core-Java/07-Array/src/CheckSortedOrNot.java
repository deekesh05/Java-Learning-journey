public class CheckSortedOrNot {
    public static boolean checkIncreasing(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>=arr[i+1])
            {
                 return false;
            }
        }
        return true;
    }
    public static boolean checkDecreasing(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = ArrayUtility.takeInput();
        if (checkIncreasing(arr) || checkDecreasing(arr))
        {
            System.out.println("Array is Sorted ");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
}
