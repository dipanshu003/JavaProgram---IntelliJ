package com.CoreJava_CW.abstraction;

public abstract class Abstraction {

    String name;

    Abstraction(String name)
    {
        this.name = name;
    }

    public abstract void showName();
}
