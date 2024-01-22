package com.Hakathon_Practice;

public class Fibonacci_Series {
    public static void main(String[] args) {
        fabonacci();
    }

    public static void fabonacci()
    {
        int a =0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < 10; i++) {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
