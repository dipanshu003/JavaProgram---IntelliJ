package com.CoreJava_CW.polymorphism.overloading;

public class Shape {

    public double area(double side)
    {
        System.out.println("Square Area..");
        return side*side;
    }
    public double area(double length,double breadth)
    {
        System.out.println("Rectangle Area..");
        return length*breadth;
    }
    public double area(int base,int height)
    {
        System.out.println("Tringle Area..");
        int multi = base * height;
        return 0.5 * multi;
    }

    public double area(int radius)
    {
        System.out.println("Circle Area..");
        return 3.14 * radius * radius;
    }
    

    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s.area(1.5));
        System.out.println();
        System.out.println(s.area(3));
        System.out.println();
        System.out.println(s.area(2,3));
        System.out.println();
        System.out.println(s.area(2,6.8));
    }
}
