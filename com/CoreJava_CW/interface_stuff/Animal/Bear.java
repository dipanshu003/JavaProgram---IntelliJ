package com.CoreJava_CW.interface_stuff.Animal;

public class Bear implements Animal{
    @Override
    public void makeSoundw() {
        System.out.println("It is a Bear Sound...");
    }

    @Override
    public void eat() {
        System.out.println("Bear is Eating...");
    }
}
