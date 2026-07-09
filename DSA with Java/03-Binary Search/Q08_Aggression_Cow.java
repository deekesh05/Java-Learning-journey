import java.util.Arrays;

public class Q08_Aggression_Cow {
    public static void main(String[] args) {
        int [] stalls = {1,2,8,9,4};
        int numberOfCow = 3;
        int maximumPosition = slots(stalls,numberOfCow);
        System.out.println("Maximum Gap Between cows : "+maximumPosition);
    }
    static boolean isValid(int[] stalls,int cows,int minimumGap)
    {
        int cowCount = 1;
        int lastPosition = 0;
        for (int i = 0; i < stalls.length; i++) {
            if(stalls[i]-stalls[lastPosition]>=minimumGap)
            {
                cowCount++;
                lastPosition = i;
            }
            if(cowCount==cows)
            {
                return true;
            }
        }
        return false;
    }
    static int slots(int[] stalls,int cows)
    {
        Arrays.sort(stalls);
        int n = stalls.length;
        int start = 0;
        int end = stalls[n-1] - stalls[0];
        int ans = -1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if(isValid(stalls,cows,mid))
            {
                ans = mid;
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }
}
