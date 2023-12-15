package com.CoreJava_HW.program;

public class Fabonacci_Series {
    public void fabonacciSeries()
    {
        int first = 0;
        int second = 1;
        int third= 0;
        System.out.println(first);
        System.out.println(second);
        for (int i = 1; i <= 10; i++) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        Fabonacci_Series f = new Fabonacci_Series();
        f.fabonacciSeries();
    }
}