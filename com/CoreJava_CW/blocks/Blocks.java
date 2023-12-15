package com.CoreJava_CW.blocks;

public class Blocks {
    //Instance Block
    {
        System.out.println("Instance Block");
        disp();
    }

    //Static Block
    static {
        System.out.println("Static Block");
        disp();
    }

    //Constructor
    Blocks()
    {
        System.out.println("Constructor");
    }

    public static void disp()
    {
        System.out.println("This is static Method");
    }

    public static void main(String[] args) {
        Blocks b = new Blocks();
    }
}
