package com.CoreJava_CW.polymorphism.overriding.manipulation;

public class Multiplication extends Operation{
    Multiplication(double a, double b)
    {
        super(a,b);
        System.out.println("Multi : "+operation());
    }

    @Override
    public double operation() {
        return a*b;
    }
}
