package com.CoreJava_HW.pattern_printing;

public class Printing_19 {
    public static void main(String[] args) {

//        E E E E E
//        D D D D D
//        C C C C C
//        B B B B B
//        A A A A A

        char p ='E';
        for (int i = 1; i <=5 ; i++,p--) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(p+" ");
            }
            System.out.println();
        }

    }
}
