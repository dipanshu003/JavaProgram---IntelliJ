package com.CoreJava_CW.exception;

import sun.nio.cs.ext.ExtendedCharsets;

public class NullPointerexceptionClass {
    public static void main(String[] args) {

        System.out.println("Start...");

        try {
            String s = null;
            System.out.println(s.length());

        }catch (Exception e)
        {
            System.out.println("It is Null pointer exception...");
        }

    }
}
