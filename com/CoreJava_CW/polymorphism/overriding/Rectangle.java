package com.CoreJava_CW.polymorphism.overriding;

public class Rectangle extends Shape{

    int l,b;
    Rectangle(int l ,int b,String name)
    {
        super(name);
        this.l = l;
        this.b = b;
    }
    @Override
    public double area() {
        System.out.println(super.name);
        return l*b;
    }
}
