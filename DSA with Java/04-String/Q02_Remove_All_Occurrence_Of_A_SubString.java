public class Q02_Remove_All_Occurrence_Of_A_SubString {
    public static void main(String[] args) {
        String str = "daabcbaabcdc";
        String subString = "abc";
        System.out.println(removeOccurrence(str,subString));

       
    }
    static  String removeOccurrence(String str , String subString)
    {
        while(str.contains(subString))
        {
            int index = str.indexOf(subString);
            str = str.substring(0,index)  + str.substring(index + subString.length());
        }
        return str;
    }
}
