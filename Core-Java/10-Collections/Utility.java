import java.util.Collection;

public class Utility {
    public static void main(String[] args) {

    }
    public static <E> void  print(Collection<E> collection)
    {
        for (Object o : collection) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
