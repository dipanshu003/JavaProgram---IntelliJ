package com.CoreJava_HW.pattern_printing;

public class Printing_18 {
    public static void main(String[] args) {

//        ReverseInWords ReverseInWords ReverseInWords ReverseInWords ReverseInWords
//        B B B B B
//        C C C C C
//        D D D D D
//        E E E E E

        char p ='A';
        for (int i = 1; i <=5 ; i++,p++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(p+" ");
            }
            System.out.println();
        }


    }
}
