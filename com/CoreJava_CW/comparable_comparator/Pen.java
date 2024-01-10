package com.CoreJava_CW.comparable_comparator;

import org.jetbrains.annotations.NotNull;

public class Pen implements Comparable<Pen>{
    private int price;
    private String type;

    public Pen(int price, String type) {
        this.price = price;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Pen o) {
        return this.price - o.price;
    }
}
