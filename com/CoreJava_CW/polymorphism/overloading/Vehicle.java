package com.CoreJava_CW.polymorphism.overloading;

public class Vehicle {

    void disp()
    {
        System.out.println("This is Empty display method...");
    }
    int disp(int type)
    {
        return type;
    }

    String disp(String brand,int type)
    {
        String a = brand+" "+type;
        return a;
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.disp();
        System.out.println(v.disp(4));
        System.out.println(v.disp("tata",8));

    }

}
