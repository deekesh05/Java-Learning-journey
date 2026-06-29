package Thread.Questions.question102;

public enum Signals {
    RED(10000),GREEN(7000),YELLOW(3000);

    private final long trafficLightTime;

    Signals(long trafficLightTime) {
        this.trafficLightTime = trafficLightTime;
    }

    public long getTrafficLightTime() {
        return trafficLightTime;
    }
}
