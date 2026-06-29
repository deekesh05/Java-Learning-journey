import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FrequencyInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(5);
        System.out.println(Collections.frequency(arrayList,5));
    }
}
