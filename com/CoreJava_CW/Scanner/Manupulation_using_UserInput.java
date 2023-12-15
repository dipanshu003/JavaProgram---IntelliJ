package com.CoreJava_CW.Scanner;

import java.util.Scanner;

public class Manupulation_using_UserInput {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int a ,b;
        double m,n;


        System.out.print("Enter First Value for Subtraction : ");
        m = x.nextDouble();
        System.out.print("Enter Second Value for Subtraction : ");
        n = x.nextDouble();
        System.out.println("Your Addition : "+(m-n));
        System.out.println();

        System.out.print("Enter First Value for Addition : ");
        m = x.nextDouble();
        System.out.print("Enter Second Value for Addition : ");
        n = x.nextDouble();
        System.out.println("Your Addition : "+(m+n));
        System.out.println();

        System.out.print("Enter First Value for Multiplication : ");
        m = x.nextDouble();
        System.out.print("Enter Second Value for Multiplication : ");
        n = x.nextDouble();
        System.out.println("Your Multiplication : "+(m*n));
        System.out.println();

        System.out.print("Enter First Value for Division : ");
        a = x.nextInt();
        System.out.print("Enter Second Value for Division : ");
        b = x.nextInt();
        System.out.println("Your Division : "+(a/b));
        System.out.println();

        System.out.print("Enter First Value for Reminder : ");
        a = x.nextInt();
        System.out.print("Enter Second Value for Reminder : ");
        b = x.nextInt();
        System.out.println("Your Reminder : "+(a%b));
        System.out.println();



    }
}
