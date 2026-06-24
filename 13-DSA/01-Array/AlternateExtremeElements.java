import java.util.ArrayList;

public class AlternateExtremeElements {
    public static void main(String[] args) {
        int []  arr = {1,2,4,6,7,8,9};


        ArrayUtility.printArray(extremeElements(arr));

        // USE ArrayList and For loop
//        ArrayList<Integer> newArr = extremeElements(arr);
//        for(int val : newArr)
//        {
//            System.out.print(val + "  " ) ;
//        }
    }
//    static ArrayList<Integer> extremeElements(int[] arr)
//    {
//        int size = arr.length-1;
//        ArrayList<Integer> newArr = new ArrayList<>();
//        for (int i = 0; i < arr.length/2; i++) {
//            newArr.add(arr[i]);
//            newArr.add(arr[size]);
//            size--;
//        }
//        if(arr.length % 2 != 0) {
//            newArr.add(arr[arr.length / 2]);
//        }
//        return newArr;
//    }

    static int[] extremeElements(int[] arr)
    {
        int [] newArr = new int[arr.length];
        int l = 0;
        int i=0;
        int j = arr.length-1;
        while(i<=j)
        {
            if(i==j)
            {
                newArr[l] = arr[i];
                break;
            }
            newArr[l]=arr[i];
            i++;
            l++;
            newArr[l] = arr[j];
            j--;
            l++;
        }
        return newArr;
    }

}
