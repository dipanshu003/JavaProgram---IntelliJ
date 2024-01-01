package com.CoreJava_CW.collection_framework.collection.list.using_generic;

import java.util.Scanner;

public class Book {
    String name;
    int price, quantity, total_price;

    static Scanner x = new Scanner(System.in);

    public Book() {
        addTotal();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", total_price=" + total_price +
                '}';
    }

    public void addTotal() {
        System.out.println("Enter Book name: ");
        name = x.next();
        System.out.println("Enter price: ");
        price = x.nextInt();
        System.out.println("Enter Quantity: ");
        quantity = x.nextInt();

        total_price = quantity * price;
        System.out.println("Total Price = " + total_price);
    }
}
