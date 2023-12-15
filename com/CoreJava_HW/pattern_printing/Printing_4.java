package com.CoreJava_HW.pattern_printing;

public class Printing_4 {
    public static void main(String[] args) {
//
//        1 3 5 7 9
//        1 3 5 7 9
//        1 3 5 7 9
//        1 3 5 7 9

        for (int i = 1; i <=5 ; i++) {
            int p = 1;
            for (int j = 1; j <=5 ; j++,p=p+2) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
