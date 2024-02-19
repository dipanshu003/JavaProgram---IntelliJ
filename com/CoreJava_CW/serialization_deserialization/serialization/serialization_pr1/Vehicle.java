package com.CoreJava_CW.serialization_deserialization.serialization.serialization_pr1;

import java.io.Serializable;

public class Vehicle implements Serializable {
    public int id;
    public String name;
    public double price;


    //Constructor
    public Vehicle() {
    }

    public Vehicle(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
