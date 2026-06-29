import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        Utility.print(arrayList);
        arrayList.remove(2);
        Utility.print(arrayList);


    }
}
