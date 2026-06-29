import java.util.ArrayList;

public class Q17_Disappeared_Elements_LC448 {
    public static void main(String[] args) {
        int [] arr  = {1,4,4,5,2,2};
        for(int val : disapearedelements(arr))
        {
            System.out.print(val + "  ");
        }
    }
    static ArrayList<Integer> disapearedelements(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            int value = Math.abs(arr[index]);
            int position = value-1;
            if(arr[position] > 0)
            {
                arr[position] = -arr[position];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>0)
            {
                list.add(i+1);
            }
        }
        return list;
    }

}
