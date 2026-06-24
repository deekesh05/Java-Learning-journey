import java.util.Arrays;
import java.util.HashMap;

public class ModeofArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,4,4,5,6,6,6,6,6,6,6,6,6,6};
        System.out.println(Arrays.toString(mode(arr)));
    }
    static int[] mode(int[] arr)
    {
//        HashMap<Integer,Integer> freq = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int minmode = arr[0];
        int max = -1;
        int mode = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    count++;
                }
            }
            if (max<count)
            {
                max = count;
                mode = arr[i];
            }
            if(min>count)
            {
                min = count;
                minmode = arr[i];
            }
        }
        int[] newArr = {mode,minmode};
        return newArr;
    }

}
