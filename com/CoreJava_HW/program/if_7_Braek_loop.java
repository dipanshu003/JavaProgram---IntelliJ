package com.CoreJava_HW.program;

import java.util.Scanner;

public class if_7_Braek_loop {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter Your Number : ");
            int a = x.nextInt();


            if (a==7)
            {
                System.out.println();
                System.out.println("Your Loop is Over...");
                break;
            }
            System.out.println("Your Number is : " +a);
            System.out.println();

        }
    }
}
