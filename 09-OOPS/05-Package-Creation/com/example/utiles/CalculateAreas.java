package com.example.utiles;
import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

import java.util.Scanner;

public class CalculateAreas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Circle");
        System.out.print("Please Enter Radius for Circle : ");
        int radius = input.nextInt();
        Circle crl = new Circle(radius);
        System.out.println(areaOfCircle(radius));
        System.out.println("For Rectangle");
        System.out.println("Please Enter height of rectangle : ");
        int height = input.nextInt();
        System.out.println("Please Enter width of rectangle : ");
        int width = input.nextInt();
        Rectangle rgt = new Rectangle(height,width);
        System.out.println(areaOfRectangular(height,width));
    }
    public static double areaOfCircle(int radius)
    {
        return Math.PI*radius*radius;
    }
    public static double areaOfRectangular(int height , int width)
    {
        return height*width;
    }
}
