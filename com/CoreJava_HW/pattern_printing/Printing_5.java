package com.CoreJava_HW.pattern_printing;

public class Printing_5 {
    public static void main(String[] args) {

//        0 2 4 6 8
//        0 2 4 6 8
//        0 2 4 6 8
//        0 2 4 6 8
//        0 2 4 6 8

        for (int i = 1; i <=5 ; i++) {
            int p =0;
            for (int j = 1; j <=5 ; j++,p+=2) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
