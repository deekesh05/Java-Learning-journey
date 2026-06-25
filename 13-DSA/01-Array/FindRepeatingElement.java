import java.util.HashMap;

public class FindRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6};
        System.out.println(repeatedElement(arr));
    }
    //1st Solution BruteForce
    static int repeatedElement(int [] arr)
    {
        HashMap<Integer , Integer> elements = new HashMap<>();
        for(int key : arr)
        {
            elements.put(key,elements.getOrDefault(key,0)+1);
        }
        for(int i : arr ){
            if(elements.get(i) > 1){
                return i;
            }
        }

        return -1;
    }
}
