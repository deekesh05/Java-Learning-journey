import java.util.HashMap;

public class ModeByHashMap {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5};
        getMode(arr);

    }



    static void getMode(int [] arr)
    {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        // FOR PRINTING KEY VALUE PAIRS
//        for(int val : freq.keySet())
//        {
//            System.out.println( val + " -> " +freq.get(val));
//        }

        int maxFrequency = -1;
        int maxFreqKey = -1;
        for(int key : freq.keySet())
        {
         int currentKey = key;
         int currentkeyMaxFrequency = freq.get(key);
         if(currentkeyMaxFrequency>maxFrequency)
         {
             maxFrequency = currentkeyMaxFrequency;
             maxFreqKey = currentKey;
         }
        }
        System.out.println("Max frequency Key : " + maxFreqKey);

        int minFrequency = Integer.MAX_VALUE;
        int minFrequencyKey = -1;
        for(int key : freq.keySet())
        {
            int currentKey = key;
            int currentKeyMaxFrequency = freq.get(key);
            if(currentKeyMaxFrequency<minFrequency)
            {
                minFrequency=currentKeyMaxFrequency;
                minFrequencyKey = currentKey;
            }
        }
        System.out.println("Min frequency Key : " + minFrequencyKey);

    }
}
