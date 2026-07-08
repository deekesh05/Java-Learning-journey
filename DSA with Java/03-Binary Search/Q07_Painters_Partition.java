public class Q07_Painters_Partition {
    public static void main(String[] args) {
        int [] arr = {5,10,30,20,15};
        int totalPainters = 3;
        int minimumTime = paintersAlgo(arr,totalPainters);
        System.out.println("Minimum time Taken by painters : " + minimumTime);
    }
    static  boolean isValid(int[] boards,int maxLength,int maxPainters)
    {
        int painter = 1;
        int paintedBoard = 0;
        for (int i = 0; i < boards.length; i++) {
            if(paintedBoard + boards[i] <= maxLength)
            {
                // Assign painters
                paintedBoard += boards[i];
            }
            else
            {
                //Change Painter
                painter++;
                // painted board = 0 because new painter start from 0
                paintedBoard=0;
                if(painter>maxPainters || boards[i] > maxLength)
                {
                    return false;
                }
                else
                {
                    paintedBoard += boards[i];
                }
            }
        }
        return true;
    }
    static int paintersAlgo(int[] boards, int totalPainters)
    {
        // calculate sum of all boards
        int n = boards.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=boards[i];
        }
        int start = 0;
        int end = sum;
        int ans = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(isValid(boards,mid,totalPainters))
            {
                 ans = mid;
                end= mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;
    }
}
