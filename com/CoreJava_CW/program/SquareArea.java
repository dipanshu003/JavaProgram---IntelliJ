package com.CoreJava_CW.program;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double s;
        System.out.print("Enter Side of Square : ");
        s = x.nextDouble();

        System.out.println("Area of Square is "+(s*s));
    }
}
