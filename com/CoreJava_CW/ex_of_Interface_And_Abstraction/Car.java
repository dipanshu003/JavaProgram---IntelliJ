package com.CoreJava_CW.ex_of_Interface_And_Abstraction;

public class Car extends AbstractVehicle{

    double speed;

    public Car(String brand,double speed) {
        super(brand);
        this.speed = speed;
    }

    @Override
    public double accelerate(double speed) {
        this.speed = this.speed + speed;
        return  this.speed;
    }

    @Override
    public double decelerate(double speed) {

        this.speed = this.speed - speed;

        if (this.speed<=0)
        {
            this.speed =0;

        }
        return this.speed;

    }

    public static void main(String[] args) {
        Car c = new Car("Tata",10);
        System.out.println(c.getBrand());
        System.out.println(c.start());
        System.out.println(c.accelerate(20));
        System.out.println(c.decelerate(0));
        System.out.println(c.stop());
    }
}
