package Abstraction;

public class Square extends Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
