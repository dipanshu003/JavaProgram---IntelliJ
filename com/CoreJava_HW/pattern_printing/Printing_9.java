package com.CoreJava_HW.pattern_printing;

public class Printing_9 {
    public static void main(String[] args) {
//         *  *  *  *  *
//         *  *  *  *  *
//         #  #  #  #  #
//         *  *  *  *  *
//         *  *  *  *  *

        for (int i = 1; i <=5; i++) {
            int mid = (5/2)+1;
            for (int j = 1; j <=5 ; j++) {

                if (i==mid)
                {
                    System.out.print(" # ");
                }
                else {
                    System.out.print(" * ");
                }

            }

            System.out.println();
        }
    }
}
