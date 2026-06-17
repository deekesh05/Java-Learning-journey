package Thread.Questions.question100;

public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {
        CreateThreads t1 = new CreateThreads(1);
        CreateThreads t2 = new CreateThreads(2);

        System.out.println(t1.getState());
        t1.start();
        t2.start();
        Thread.sleep(5000);
        System.out.println(t1.getState());
    }
}
