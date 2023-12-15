package com.CoreJava_HW.pattern_printing;

public class Printing_6 {
    public static void main(String[] args) {

//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E

        for (int i = 1; i <=5 ; i++) {
            char p ='A';
            for (int j = 1; j <=5 ; j++,p++) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
