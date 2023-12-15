package com.CoreJava_HW.Operator;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter marks under 100 individual...");

        int maths,sci,sans,hindi,eng;
        System.out.print("Enter Your Mathematics Number : ");
        maths = x.nextInt();
        System.out.print("Enter Your Science Number : ");
        sci = x.nextInt();
        System.out.print("Enter Your Sanskrit Number : ");
        sans = x.nextInt();
        System.out.print("Enter Your Hindi Number : ");
        hindi = x.nextInt();
        System.out.print("Enter Your English Number : ");
         eng= x.nextInt();
        System.out.println();

         int total = (maths+sci+sans+hindi+eng);
        int per =total/5;
        System.out.println("Your Percentage = "+per);
        System.out.println();

        if (per>=35)
        {
            System.out.println("Your are pass");
        }
        else {
            System.out.println("Your are Fail.");
        }



    }
}
