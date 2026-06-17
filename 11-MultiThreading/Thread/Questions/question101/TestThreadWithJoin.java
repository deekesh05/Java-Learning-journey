package Thread.Questions.question101;

public class TestThreadWithJoin {
    public static void main(String[] args) {
        CreateThreads t1 =new CreateThreads(1);
        CreateThreads t2 =new CreateThreads(2);
        CreateThreads t3 =new CreateThreads(3);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        } catch (InterruptedException e) {
            System.out.println("Thread is Interrupted : "+e.getMessage());
        }

    }
}
