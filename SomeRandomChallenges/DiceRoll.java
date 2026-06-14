public class DiceRoll {
    public static void main(String[] args) {
        double roll = (int)Math.ceil(Math.random() * 6);
        System.out.println("Roll Dice : " + roll);
    }
}
