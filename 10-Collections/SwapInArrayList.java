import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapInArrayList {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(2,5,3,7,8,6,5,4,1,2,5,88,52);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(5);
        Utility.print(arrayList);
        Collections.swap(arrayList,1,3);
        Utility.print(arrayList);

        // Reversing ArrayList By Collections
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
