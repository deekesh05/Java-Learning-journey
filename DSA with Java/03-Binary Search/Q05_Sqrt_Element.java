public class Q05_Sqrt_Element {
    public static void main(String[] args) {
        sqrt(56);
    }
    static void sqrt(int num)
    {
        int start = 1;
        int end = num;
        double ans = -1;
        while(start<=end)
        {
         int mid  = start + (end-start)/2;
         if(mid ==num/mid)
         {
             System.out.println(mid);
         }
         //if mid * mid > num
         else if (mid>num/mid)
         {
             end = mid-1;
         }
         else
         //if mid*mid < number
         {
             ans = mid;
             start = mid + 1;
         }
        }
        System.out.println(ans);

        // For Decimal values
        double factor = 1;
        int pricious = 3;
        for (int i = 1; i <= pricious; i++) {
             factor = factor/10;
            for (int j = 1; j <= 10; j++) {
               double newans = ans + factor;
               if(newans  == num/newans)
               {
                   System.out.println(newans);
                   break;
               } else if (newans < num/newans) {
                   ans = newans;
               }
               else
               // if newans * newans > number then break
               {
                   break;
               }
            }
            System.out.println("answer after round : " + Math.round(ans*1000.0)/1000.0);

        }
        System.out.println("Final Answer  : " + Math.round(ans*1000.0)/1000.0);
    }
}
