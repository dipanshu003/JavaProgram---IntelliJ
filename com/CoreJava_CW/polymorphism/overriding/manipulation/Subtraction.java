package com.CoreJava_CW.polymorphism.overriding.manipulation;

public class Subtraction extends Operation {
    Subtraction(double a, double b)
    {
        super(a,b);
        System.out.println("Subtraction : "+operation());
    }

    @Override
    public double operation() {
        return a-b;
    }
}
