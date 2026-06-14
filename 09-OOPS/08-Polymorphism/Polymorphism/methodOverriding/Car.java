package Polymorphism.methodOverriding;

class Car extends Vehicle{
    @Override
    void service() {
        super.service();
        System.out.println("Car is Servicing ");
    }
}
