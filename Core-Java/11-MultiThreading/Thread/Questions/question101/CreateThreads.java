package Thread.Questions.question101;

public class CreateThreads extends Thread{
    private final int  threadName;

    public CreateThreads(int threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + "Thread is started");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Welcome to Thread " + threadName);
        }
        System.out.println(threadName + "Thread is started");

    }
}
