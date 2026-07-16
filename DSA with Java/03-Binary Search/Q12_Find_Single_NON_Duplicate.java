public class Q12_Find_Single_NON_Duplicate {
    public static void main(String[] args) {
        int arr [] = {10,20,20,30,30,40,40,50,50,60,60,70,70};
        System.out.println("Single Element IN Array : " + findSingleElement(arr));
    }
    static  int findSingleElement(int [] arr)
    {
        int start = 0;
        int n = arr.length;
        int end = n-1;
        while(start <= end)
        {
            int mid  = start + (end - start )/2;
            if(start == end)
            {
                return arr[start];
            }
            // Current Element
            int current = arr[mid];

            // Previous Element
            int preValue = -1;
            if(mid-1 >= 0)
            {
                preValue = arr[mid-1];
            }

            //Next Value
            int nextValue = -1;
            if(mid+1 < n)
            {
                nextValue = arr[mid+1];
            }

            if(current != preValue && current != nextValue)
            {
                return current;
            }
            if(current != preValue && current == nextValue)
            {
                int startIndex = mid;
                if(startIndex % 2 != 0){
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }
            if(current == preValue && current != nextValue){
                int endIndex = mid;
                if(endIndex %2 != 0){
                    start = mid +1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

}
