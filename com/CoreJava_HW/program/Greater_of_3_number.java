package com.CoreJava_HW.program;

public class Greater_of_3_number {
    public static void main(String[] args) {
        int a=13,b=5,c=3;

        if (a>b && a>c)
        {
            System.out.println(a+" is grater than "+b+" & "+c);
        } else if (b>a && b>c) {
            System.out.println(b+" is greater than "+a+" & "+c);
        }
        else {
            System.out.println(c+" is greater than "+a+" & "+b);
        }
    }
}
