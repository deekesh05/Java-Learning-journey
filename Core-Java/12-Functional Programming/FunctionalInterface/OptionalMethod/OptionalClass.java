package FunctionalInterface.OptionalMethod;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        System.out.println(optionalstr(null));
        System.out.println(optionalstr(""));
        System.out.println(optionalstr("Deekesh"));


    }
    public static Optional<String> optionalstr(String str)
    {
        if(str == null || str.isEmpty())
        {
            return Optional.empty();
        }
        return  Optional.of(str.toUpperCase());
    }
}
