package com.CoreJava_CW.abstraction.examole2_Shape;

public class Square extends Shape{

    Square(String shape_name,String color,int sides)
    {
        super(shape_name, color, sides);
    }

    @Override
    public void draw() {
        System.out.println("This is Faltu Method...");
    }

    @Override
    public void cal_area() {
        System.out.println("Area of Square iis -> "+super.sides*super.sides);
    }

    public static void main(String[] args) {
        Shape s = new Square("Square","Black",4);
        s.draw();
        s.display();
        s.cal_area();

    }

}
