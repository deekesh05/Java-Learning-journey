package enums;

public class TestEnums {
    public static void main(String[] args) {
        for (Days value : Days.values()) {
            System.out.println(value);
        }

        for (Days days : Days.values()) {
            System.out.printf("%s :  %s \n"  , days , days.typeof());
        }
    }
}
