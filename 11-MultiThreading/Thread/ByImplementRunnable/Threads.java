package Thread.ByImplementRunnable;

 class Threads implements Runnable{
    private final String targetSymbol;

    public Threads(String targetSymbol) {
        this.targetSymbol = targetSymbol;
    }

    @Override
    public void run() {
        System.out.print("Start printing " + targetSymbol );
        for (int i = 0; i < 100; i++) {
            System.out.print(i+targetSymbol+" ");
        }
    }
}
