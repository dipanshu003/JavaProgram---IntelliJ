package com.CoreJava_CW.operators;

public class ArithmeticOperator {
    public static void main(String[] args) {

        System.out.println("\t***Arithmetic Operator***");
        System.out.println();
        System.out.println("-> Addition");
        int a = 10;
        int b = 20;
        int add = a+b;
        System.out.println("Adddition : "+add);
        System.out.println();

        System.out.println();
        System.out.println("-> Subtraction");
        float a1 = 40;
        float b1 = 254;
        float sub = a1-b1;
        System.out.println("Subtraction : "+sub);
        System.out.println();

        System.out.println();
        System.out.println("-> Multiplication");
        double a2 = 10934;
        double b2 = 2058;
        double multi = a2*b2;
        System.out.println("Multiplication : "+multi);
        System.out.println();

        System.out.println();
        System.out.println("-> Division");
        float a4 = 100;
        float b4 = 20;
        float div = a4/b4;
        System.out.println("Division : "+div);
        System.out.println();


        System.out.println();
        System.out.println("-> Modulus");
        int a5 = 100;
        int b5 = 20;
        float mod = a5%b5;
        System.out.println("Reminder : "+mod);
        System.out.println();

        System.out.println("\t***Relational Operator***");
        System.out.println("a="+a+"&"+"b"+b);
        System.out.println();

        System.out.println("a>b is"+(a>b));
        System.out.println("a<b is"+(a<b));
        System.out.println("a>=b is"+(a>=b));
        System.out.println("a<=b is"+(a<=b));
        System.out.println("a==b is"+(a==b));
        System.out.println("a!=b is"+(a!=b));


    }
}
