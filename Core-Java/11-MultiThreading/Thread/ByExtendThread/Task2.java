package Thread.ByExtendThread;

public class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Printing # ");
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d %s ",i ,"#" );
        }
    }
}
