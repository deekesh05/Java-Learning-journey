package Polymorphism.methodOverloading;

class Calculator {
    int sum(int num1 , int num2){
        return num1+num2;
    }
    int sum(int num1 , int num2,int num3){
        return num1+num2+num3;
    }
    double sum(double num1 , double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,5));
        System.out.println(calculator.sum(5,5,8));
        System.out.println(calculator.sum(5.8,5.6));

    }

}
