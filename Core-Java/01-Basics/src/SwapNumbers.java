class SwapNumbers {
    public static void main(String[] args) {

        int first = 10;
        int second = 20;

        System.out.println("Before Swap");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Swap");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

    }
}