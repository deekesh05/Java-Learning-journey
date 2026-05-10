public class CheckArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.takeInput();
        ArrayUtility.printArray(arr);
        System.out.println();
        if (checkPalindrome(arr))
        {
            System.out.println("Array is Palindrome");
        }
        else
        {
            System.out.println("Array is not a Palindrome");
        }

    }
    public static boolean checkPalindrome(int[]arr)
    {
        int start=0;
        int end = arr.length-1;
        while(start<end)
        {
            if(arr[start]!=arr[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
