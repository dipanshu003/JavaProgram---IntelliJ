package com.CoreJava_HW.program;

public class Middle_of_3_number {
    public static void main(String[] args) {
        int a = 1, b =28,c=2;

        if (b>a && a>c)
        {
            System.out.println("a is middle element");
        } else if (a>b && b>c) {
            System.out.println("b is middle element");
        }
        else {
            System.out.println("c is middle element");
        }
    }
}
