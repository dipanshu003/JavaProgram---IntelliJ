package com.CoreJava_CW.program;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = x.nextInt();

        System.out.println();

        if (num%2==0)
        {
            System.out.println(num+" is a Even number");
        }
        else
        {
            System.out.println(num+" is a Odd number");
        }
    }
}
