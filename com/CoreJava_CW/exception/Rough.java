package com.CoreJava_CW.exception;

public class Rough {
    public static void main(String[] args) {

        try {
            System.out.println("Start..");
            System.out.println(10/0);
            System.out.println("End...");
        }
        catch (ArithmeticException e)
        {
            System.out.println("It is Arithmetic Exception....");
        }
    }
}
