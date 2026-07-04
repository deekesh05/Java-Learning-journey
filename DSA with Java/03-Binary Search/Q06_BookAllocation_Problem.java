public class Q06_BookAllocation_Problem {
    public static void main(String[] args) {
        // Books = 10,20,30,40,50
        int [] arr = {10,20,30,40,50};
        int numberOfStudents = 2;
        System.out.println(allocateBook(arr,numberOfStudents));
    }
    // check Answer is valid or not by brute force
    static  boolean isValidAnswer(int [] arr,int maximumStudent,int maximumPages)
    {
        int student = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
         //if pages means 10 + 20 + 30 < maximum then store in pages
            if(pages + arr[i] <= maximumPages)
            {
                pages+=arr[i];
            }
            //if pages > maximum then check Change the student
            else
            {
                // change student by 1
                student++;
                // check that student will be less than maximum student
                //also check number of pages will be less than arr[i]
                if(student>maximumStudent || arr[i] > maximumPages )
                {
                    // if arr[i] = 90 but maximum pages is 75 then return false
                    //if student is > (greater than) maximum student then return false
                    return false;
                }
                else
                {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }

    static  int allocateBook(int[] arr , int k )
    {
        int n = arr.length;
        int start = 1;
        int ans = -1;
        int sum = 0;
        //if number of books is less than number of students then return -1
        if(n<k)
        {
            return -1;
        }
        // get sum of all book for end element so that we can use binary search
        for(int val : arr)
        {
            sum+=val;
        }
        int end = sum;
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(isValidAnswer(arr,k,mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return ans;
    }
}
