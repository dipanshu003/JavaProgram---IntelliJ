package com.CoreJava_CW.inheritance.single_inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Vehicle Type : ");
        String type = x.next();
        System.out.println("Enter Car Name : ");
        String name = x.next();
        System.out.println("Enter Car no : ");
        int no = x.nextInt();

        Car c1 = new Car();
        c1.name=name;
        c1.carno = no;
        Car.type = type;

        Car.dispCar();
    }
}
