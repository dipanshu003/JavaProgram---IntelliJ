package com.CoreJava_CW.program;

import java.util.Scanner;

public class Greater_lesser_Equal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = x.nextInt();
        System.out.println();

        if (num>0)
        {
            System.out.println("It is a Positive Value");
        } else if (num<0) {
            System.out.println("It is a Negative Value");
        }
        else {
            System.out.println("It is equal to Zero");
        }
    }
}
