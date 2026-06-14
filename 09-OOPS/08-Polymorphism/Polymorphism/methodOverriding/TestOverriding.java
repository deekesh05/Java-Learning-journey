package Polymorphism.methodOverriding;

public class TestOverriding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Vehicle vCar = new Car();
        c.service();
        v.service();
        vCar.service();

    }
}
