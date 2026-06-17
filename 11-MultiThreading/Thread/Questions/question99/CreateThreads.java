package Thread.Questions.question99;

public class CreateThreads extends Thread{
    private final int  threadName;

    public CreateThreads(int threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Welcome to Thread " + threadName);
        }
    }
}
