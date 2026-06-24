import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int [] arr1 = ArrayUtility.takeInput();
        int [] arr2 = ArrayUtility.takeInput();
        ArrayList<Integer> arr =  intersection(arr1,arr2);
        for(int val : arr){
            System.out.println(val);
        }

    }
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j])
                {
                    newArr.add(arr1[i]);
                    break;
                }
            }
        }
      return newArr;
    }
}
