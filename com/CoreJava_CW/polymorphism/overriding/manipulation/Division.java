package com.CoreJava_CW.polymorphism.overriding.manipulation;

public class Division extends Operation {
    Division(double a , double b)
    {
        super(a,b);
        System.out.println("Division : "+operation());
    }

    @Override
    public double operation() {
        return a/b;
    }
}
