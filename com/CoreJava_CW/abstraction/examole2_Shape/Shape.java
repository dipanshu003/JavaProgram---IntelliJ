package com.CoreJava_CW.abstraction.examole2_Shape;

public abstract class Shape {
    String shape_name , color;
    int sides;
    Shape(String shape_name,String color,int sides )
    {
        this.shape_name = shape_name;
        this.color = color;
        this.sides = sides;
    }

    public abstract  void draw();

    public abstract void cal_area();

    void display()
    {
        System.out.println("Shape Name -> "+this.shape_name);
        System.out.println("Color - > "+this.color);
        System.out.println("sides - > "+this.sides);
    }
}
