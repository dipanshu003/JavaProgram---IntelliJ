package com.CoreJava_CW.exception.CustomizeException.InvalidPinException;

import com.CoreJava_CW.exception.user_defined.InvalidPasswordException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InvalidPinException{

        System.out.println("Program Start..");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Your Pin : ");
        int pin = x.nextInt();

        try
        {

            if (pin == 1234)
            {
                System.out.println("Correct Pin...");
            }
            else {
                throw  new InvalidPinException("Invalid Pin...");
            }
        }
        catch (InvalidPinException e)
        {
            System.err.println(e);
        }
        System.out.println("Done..");

    }
}
