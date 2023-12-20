package com.CoreJava_CW.collection.list.using_generic;

public class Bike {
    String name;
    float price;

    Bike(String name,float price)
    {
        this.price = price;
        this.name= name;
    }

    @Override
    public String toString() {
        return "Name -> "+this.name+" , "+"Price -> "+this.price;
    }
}
