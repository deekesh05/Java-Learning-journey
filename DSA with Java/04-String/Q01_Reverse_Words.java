public class Q01_Reverse_Words {
    public static void main(String[] args) {
        String str = "My Name is Deekesh";
        String ans = reverseWords(str);
        System.out.println(ans);
    }
    static String reverseWords(String str)
    {
        StringBuilder ans = new StringBuilder();
        int i = str.length()-1;
        while(i>=0)
        {
            while(i >= 0 && str.charAt(i) == ' ')
            {
                i--;
            }
            int j = i;
            while(j>=0 && str.charAt(j) != ' ')
            {
                j--;
            }
            ans.append(str.substring(j+1,i+1));
            while(j>=0 && str.charAt(j) == ' ' )
            {
                j--;
            }
            if(j>=0){
                ans.append(' ');
            }
            i = j;
        }
        return ans.toString();
    }
}
