package Thread.Questions.question99;

public class TestThread {
    public static void main(String[] args) {
        CreateThreads t1 = new CreateThreads(1);
        CreateThreads t2 = new CreateThreads(2);

        t1.start();
        t2.start();
    }
}
