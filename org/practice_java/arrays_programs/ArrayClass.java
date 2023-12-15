package org.practice_java.arrays_programs;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 21, 21};
        Car car1 = new Car("Sonet", 49594, 1200000);
        Car car2 = new Car("Thar", 93849, 2200000);
        Car car3 = new Car("Fortuner", 93884, 3000000);
        Car car4 = new Car("Audi Q8", 59083, 12000000);

        Car[] cArr = {car1, car2, car3, car4};
        System.out.println(Arrays.toString(cArr));
    }
}

class Car {
    String cName;
    int cNumber;
    int cPrice;

    Car(String cName, int cNumber, int cPrice) {
        this.cName = cName;
        this.cNumber = cNumber;
        this.cPrice = cPrice;
    }

    @Override
    public String toString() {
        return "[" + cName + "," + cNumber + "," + cPrice + "]";
    }
}
