import java.util.Scanner;

public class StringUtility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter String : ");
        String str = input.nextLine();
        System.out.println(length(str));
        System.out.println(reverseString(str));
        System.out.println(numberOfVowels(str));

    }
    public static int length(String str)
    {
        return str.length();
    }
    public static String reverseString(String str)
    {
        String revStr = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }
    public static int numberOfVowels(String str)
    {
       int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                count ++;
            }
        }
        return count;
    }
}
