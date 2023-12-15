package com.CoreJava_CW.inheritance.hierarchical_inheritance;

public class Rectangle extends Shape{

    double l , b ;
    Rectangle(double l, double b,String name,String color )
    {
        super(name,color);
        this.l = l;
        this.b = b;
    }

    public double area()
    {
        return l*b;
    }

    public void disp()
    {
        System.out.println(area());
        System.out.println(this.l);
        System.out.println(this.b);
        System.out.println(color);
        System.out.println(name);
    }
}
