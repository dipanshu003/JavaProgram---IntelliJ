package com.CoreJava_CW.constructor.car;

public class Car {
    String carName;
    String model;
    int year;

    public Car(String carName , String model, int year)
    {
        this.carName = carName;
        this.model = model;
        this.year = year;
        display();
    }

    public void display()
    {
        System.out.println("Car Name -> "+this.carName);
        System.out.println("Model Number -> "+this.model);
        System.out.println("Year -> "+this.year);
    }
}
