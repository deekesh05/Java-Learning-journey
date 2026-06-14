package Interface;

public class Eagle extends Bird{

    @Override
    public void fly() {
        System.out.println("Eagle Is Flying ");
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
