package com.CoreJava_CW.FunctionalInterface;

public class LambdaEx{
    public static void main(String[] args) {
        FunctionalInterface f = ()-> {
            System.out.println("this is lambda expression....");
        };

        f.m1();
    }

}
