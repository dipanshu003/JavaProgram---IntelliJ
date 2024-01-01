package com.MockTest;

import java.util.Iterator;

public class Fabonacci {
    public static void main(String[] args) {
        Fabonacci f = new Fabonacci();
        fabonacci();
    }
    public static void fabonacci()
    {
        int first = 0;
        int second = 1;
        int third = 0;

        for (int i = 0; i < 10; i++) {
            third = first + second;

            System.out.print(third+" ");

            first=second;
            second=third;

        }
    }
}
