import java.util.ArrayList;
import java.util.Scanner;

public class Q13_Binary_Search_In_Infinite_Array {
    public static ArrayList<Integer> infiniteArray(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Range of Infinite Array : ");
        int range  = input.nextInt();
        ArrayList<Integer> arrayList = infiniteArray(range);
        int target = 40;
        System.out.println("Index of " + target + " : " + findElementInUnboundedArray(arrayList,target));
    }
    static int findElementInUnboundedArray(ArrayList<Integer> list , int target)
    {
        //Exponential Search in this i = i*2
        if(list.get(0)==target)
        {
            return  0 ;
        }
        int i = 1;
        while(list.get(i)<=target)
        {
            i*=2;
        }
        if(list.get(i)>target)
        {
            //We Found Our Range
            int start = i/2;
            int end = i;
            // Normal Binary Search Between that Range
            while (start<=end)
            {
                int mid = start + (end-start)/2;
                if(list.get(mid)==target){
                    return mid;
                } else if (list.get(mid)<target) {
                    start = mid +1 ;
                }
                else {
                    end = mid -1;
                }
            }
        }

        return -1;
    }
}
