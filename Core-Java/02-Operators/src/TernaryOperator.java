//it give true or false
//(Condition)?"True":"False"
public class TernaryOperator {

    public static void main(String[] args) {

        int number = 25;

        String result = (number % 2 == 0)
                ? "Even"
                : "Odd";

        System.out.println(result);

    }
}