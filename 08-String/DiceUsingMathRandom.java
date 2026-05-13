public class DiceUsingMathRandom {
    public static void main(String[] args) {
        double die1 = (int)Math.ceil(Math.random() * 6);
        System.out.println("Dice is Rolled " + die1);
    }
}
