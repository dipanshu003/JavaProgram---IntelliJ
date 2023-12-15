package com.CoreJava_CW.interface_stuff.Animal;

public class Fox implements Animal {
    @Override
    public void makeSoundw() {
        System.out.println("It is Sound of Fox...");
    }

    @Override
    public void eat() {
        System.out.println("Fox is eating ....");
    }
}
