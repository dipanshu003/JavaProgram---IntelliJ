package com.CoreJava_CW.ex_of_Interface_And_Abstraction;

public class Bike extends AbstractVehicle {
    double speed;
    Bike(String brand)
    {
        super(brand);
    }

    @Override
    public double accelerate(double speed) {
        return this.speed = this.speed + speed;
    }

    @Override
    public double decelerate(double speed) {
          this.speed = this.speed - speed;

          if (this.speed < 0)
          {
              this.speed = 0;
          }
          return this.speed;
    }
}
