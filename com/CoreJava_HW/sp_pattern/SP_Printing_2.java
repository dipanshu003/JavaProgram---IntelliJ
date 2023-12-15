package com.CoreJava_HW.sp_pattern;

public class SP_Printing_2 {
    public static void main(String[] args) {

//        1
//        12
//        123
//        1234
//        12345

        int k = 1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=k ; j++) {
                System.out.print(j);
            }
            k++;
            System.out.println();
        }


    }
}
