package Thread.Questions.question102;

public class CreateThreads extends Thread{
    private final Signals trafficColor;

    public CreateThreads(Signals trafficColor) {
        this.trafficColor = trafficColor;
    }

    @Override
    public void run() {

        System.out.println("Active " + trafficColor);
        try {
            Thread.sleep(trafficColor.getTrafficLightTime());
        } catch (InterruptedException e) {
            System.out.println("Thread is Interrupted : " + e.getMessage());
        }
    }
}

