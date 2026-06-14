import java.util.Arrays;

public class ConcatenateString {
    String concatenateString(String...str)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(String string : str)
        {
         stringBuilder.append(string).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        ConcatenateString cns = new ConcatenateString();
        System.out.println(cns.concatenateString(
                "Deekesh"
                ,"Pushpendra"
                ,"Devendra"
                ,"Lucky"
        ));

    }














//    public static void concatenateString(String str1,String str2,String ... str)
//    {
//        System.out.println(str1  + " " +str2 +  " " + Arrays.toString(str) +  "  ");
//    }
//
//    public static void main(String[] args) {
//        concatenateString("Deekesh","Devendra","Pushpendra","Vinay","Yogesh");
//    }




}
