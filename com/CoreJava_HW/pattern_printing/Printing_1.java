package com.CoreJava_HW.pattern_printing;

public class Printing_1 {
    public static void main(String[] args) {

//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *


        int row = 5;
        int col = 5;
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c<=col;c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
