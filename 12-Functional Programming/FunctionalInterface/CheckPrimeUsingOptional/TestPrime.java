package FunctionalInterface.CheckPrimeUsingOptional;

public class TestPrime {
    public static void main(String[] args) {
        CheckPrime checkPrime = num ->
        {
            for (int i = 2; i < num/2; i++) {
                if(num%i==0)
                {
                    return false;
                }
            }
            return true;
        };

        System.out.println(checkPrime.checkPrime(5));
    }
}
