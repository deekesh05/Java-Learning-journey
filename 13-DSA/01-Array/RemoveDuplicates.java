import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
    int [] arr = {1,2,2,2,3,4,5,5,6};
//        System.out.println(removeDupInd(arr));
//        ArrayUtility.printArray(singleElements(arr));
//        System.out.println(elements(arr));
        for(int val : distinctElements(arr))
        {
            System.out.print(val + " ");
        }


    }
    // for index
    static int removeDupInd(int[] arr)
    {
        HashMap<Integer,Integer> elements = new HashMap<>();
        for(int val : arr)
        {
            elements.put(val,elements.getOrDefault(val,0)+1);
        }

        return elements.size();
    }
    //For Array
    static int[] singleElements(int[] arr)
    {
        HashMap<Integer,Integer> elements = new HashMap<>();
        for(int val : arr)
        {
            elements.put(val,elements.getOrDefault(val,0)+1);
        }

        int[] newArr = new int[elements.size()];
        int index = 0;
        for(int nums : elements.keySet())
        {
            newArr[index] = nums;
            index++;
        }
        return newArr;
    }

    //USE Two pointer
    static int elements(int [] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(j<n)
        {
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
                j++;
            }
            else {
                j++;
            }
        }
        return i+1;
    }
    // Print new array of distinct elements
    static ArrayList<Integer> distinctElements(int [] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = 1;
        ArrayList<Integer> distinctList = new ArrayList<>();
        distinctList.add(arr[i]);
        while (j<n)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
                distinctList.add(arr[i]);
                j++;
            }
            else{
                j++;
            }
        }
        return distinctList;

    }


}
