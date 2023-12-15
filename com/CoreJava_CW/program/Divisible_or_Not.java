package com.CoreJava_CW.program;

import java.util.Scanner;

public class Divisible_or_Not {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = x.nextInt();

        System.out.print("Divisible by (Divisor) : ");
        int div = x.nextInt();
        System.out.println();

        if (num % div == 0)
        {
            System.out.println(" -> It is divisible by "+div);
        }
        else
        {
            System.out.println(" -> It is not divisible by "+div);
        }
    }
}
