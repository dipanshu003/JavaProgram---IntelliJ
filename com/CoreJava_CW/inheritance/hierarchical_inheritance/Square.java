package com.CoreJava_CW.inheritance.hierarchical_inheritance;

public class Square extends Shape{
    int side;
    Square(int side ,String name,String color)
    {
        super(name, color);
        this.side =side;
    }

    public int area()
    {
        return side*side;
    }

    public void disp()
    {
        System.out.println("Side is : "+side);
        System.out.println("Area of Square is :"+area());
        System.out.println(super.name);
        System.out.println(super.color);
    }

}
