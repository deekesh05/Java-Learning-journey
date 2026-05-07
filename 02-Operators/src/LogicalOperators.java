//Logical Operators Also give true Or False
//in AND (&&) it need to satisfy all the condition
//in OR (||) operator it need to satisfy minimum one condition
// NOT(!) reverse the condition
// 1. AND (&&)
// 2. OR (||)
// 3. NOT (!)

public class LogicalOperators {
    public static void main(String[] args) {

        int age = 21;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense);
        System.out.println(age < 18 || hasLicense);
        System.out.println(!hasLicense);

    }
}