package com.CoreJava_CW.inheritance.single_inheritance;

public class Car extends Vehicle{
    static String name;
    static int carno;

    public static void dispCar()
    {
        System.out.println(name);
        System.out.println(carno);
        disp();
    }
}
