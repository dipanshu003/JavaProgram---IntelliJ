package com.CoreJava_HW.sp_pattern;

public class SP_Printing_3 {
//            *****
//            ****
//            ***
//            **
//            *

    public static void main(String[] args) {

        int k = 5;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=k ; j++) {
                System.out.print(" * ");
            }
            k--;
            System.out.println();
        }

    }

}
