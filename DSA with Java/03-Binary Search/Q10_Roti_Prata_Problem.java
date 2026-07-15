public class Q10_Roti_Prata_Problem {
    public static void main(String[] args) {
        int[] cooksRank = {1,2,3,4};
        int totalCooks = 4;
        int pratas = 10;
        System.out.println("Minimum Time Taken for Cooking Pratas " + minTimeToCookPratas(pratas,cooksRank,totalCooks));
    }
    static  boolean isValid(int pratas,int [] cooksRank , int cooks , int timeLimit)
    {
        int totalPratas = 0;
        for(int i = 0;i<cooksRank.length;i++)
        {
            int nextPrata = 1;
            int timeTaken  = 0;
            int currentCookRank = cooksRank[i];
            while(timeTaken + nextPrata*currentCookRank<=timeLimit)
            {

                    timeTaken = timeTaken+nextPrata*currentCookRank;
                    totalPratas++;
                    nextPrata++;
                    if(totalPratas >= pratas){
                        return true;
                    }
            }

        }
        return false;
    }

    static boolean canCookRequiredPratas(int requiredPratas,
                                         int[] cookRanks,
                                         int totalCooks,
                                         int timeLimit)
    {
        int totalPratasMade = 0;

        for (int cook = 0; cook < totalCooks; cook++)
        {
            int currentCookRank = cookRanks[cook];

            int currentTime = 0;
            int prataNumber = 1;

            while (currentTime + (prataNumber * currentCookRank) <= timeLimit)
            {
                currentTime += prataNumber * currentCookRank;

                totalPratasMade++;

                prataNumber++;

                if (totalPratasMade >= requiredPratas)
                {
                    return true;
                }
            }
        }

        return false;
    }
    static int minTimeToCookPratas(int pratas , int[] cooksRank , int cooks)
    {
        int maxRank = -1;
        for (int i = 0; i < cooksRank.length; i++) {
            if(maxRank < cooksRank[i])
            {
                maxRank = cooksRank[i];
            }
        }
        int start = 0;
        int end = maxRank*(pratas*(pratas+1)/2);
        int ans = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(isValid(pratas,cooksRank,cooks,mid))
            {
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}
