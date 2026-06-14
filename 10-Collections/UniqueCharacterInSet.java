import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacterInSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> st = new HashSet<>();
        System.out.print("Please Enter Your string : ");
        String str = input.nextLine();
        for (char c : str.toCharArray()) {
            st.add(c);
        }
        System.out.printf("Unique Character in your String %s : %d" ,str,st.size());

    }
}
