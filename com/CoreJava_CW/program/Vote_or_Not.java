package com.CoreJava_CW.program;

import java.util.Scanner;

public class Vote_or_Not {
    public static void main(String[] args) {
//        int age;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = x.nextInt();

        if (age>=18)
        {
            System.out.println("Eligible for Voting");
        }
        else
        {
            System.out.println("Not Eligible for Voting");
        }
    }
}
