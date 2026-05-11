class Car {

    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        // Object Creation of Car Class
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.speed = 200;

        c1.display();
    }
}