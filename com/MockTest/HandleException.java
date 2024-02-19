package com.MockTest;

import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) throws InputNotCorrectException{

        Scanner x = new Scanner(System.in);

        System.out.println("Program is Started...");

        try
        {
            System.out.println("Enter Integer value : ");
            int a = x.nextInt();

            System.out.println("Your number is : "+a);

        }
        catch (Exception e)
        {
            InputNotCorrectException i = new InputNotCorrectException("Input not correct...");
            System.err.println(i);
        }

        System.out.println("Program is Ended...");
    }
}
