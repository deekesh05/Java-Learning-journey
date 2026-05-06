class TypeCasting {
    public static void main(String[] args) {

        int num = 10;

        double result = num;

        System.out.println("Implicit Casting: " + result);

        double price = 99.99;

        int finalPrice = (int) price;

        System.out.println("Explicit Casting: " + finalPrice);

    }
}