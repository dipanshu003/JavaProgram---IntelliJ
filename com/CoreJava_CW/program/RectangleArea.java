package com.CoreJava_CW.program;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        double a,b;

        System.out.print("Enter Length : ");
        a = x.nextDouble();
        System.out.print("Enter Breadth : ");
        b = x.nextDouble();

        System.out.println("Area of Rectangle is "+(a*b));
    }

}
