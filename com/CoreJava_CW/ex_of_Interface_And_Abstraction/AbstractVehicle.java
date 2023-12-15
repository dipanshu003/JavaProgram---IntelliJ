package com.CoreJava_CW.ex_of_Interface_And_Abstraction;

public abstract class AbstractVehicle implements Vehicle{

    private String brand;
    AbstractVehicle(String brand)
    {
        this.brand = brand;
    }


    public String getBrand()
    {
        return  brand;
    }
    @Override
    public String stop() {
        return "Vehicle is Stopping...";
    }

    @Override
    public String start() {
        return "Vehicle is Starting...";
    }

    @Override
    public abstract double accelerate(double speed);

    @Override
    public abstract double decelerate(double speed);}
