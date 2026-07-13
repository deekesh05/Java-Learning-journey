public class Q09_Eko_Spoj {
    public static void main(String[] args) {
        int [] trees = {20,15,10,17};
        //Get maximum cutting length of tree
        int minimumWood = 7;
        int maximumHeight = findMaxHeight(trees,minimumWood);
        System.out.println("Maximum Height of tree for cutting : " + maximumHeight);
    }
    static boolean isValid(int[] trees, int minimumWood ,int maximumLength)
    {
        int totalCollectedWood = 0;
        for (int i = 0; i < trees.length; i++) {
            if(trees[i]>maximumLength)
            {
                int currentTreeLength = trees[i]-maximumLength;
                totalCollectedWood+=currentTreeLength;
            }
        }
        if(totalCollectedWood>=minimumWood)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int findMaxHeight(int[] trees , int m)
    {
        int start = 0;
        int maxi = -1;
        int ans = -1;
        for (int i = 0; i < trees.length; i++) {
            if(trees[i]>maxi)
            {
                maxi=trees[i];
            }
        }
        int end = maxi;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(isValid(trees,m,mid))
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
