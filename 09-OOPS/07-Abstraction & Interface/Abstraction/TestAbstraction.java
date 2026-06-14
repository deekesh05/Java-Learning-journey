package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Area of Circle : "+ circle.calculateArea());
        Square square = new Square(5);
        System.out.println("Area of Square : "+square.calculateArea());

    }
}
