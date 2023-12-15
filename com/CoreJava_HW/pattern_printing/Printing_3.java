package com.CoreJava_HW.pattern_printing;

public class Printing_3 {
    public static void main(String[] args) {

//        5 4 3 2 1
//        5 4 3 2 1
//        5 4 3 2 1
//        5 4 3 2 1

//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 5; j >=1 ; j--) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


        for (int i = 1; i <=5 ; i++) {
            int  p = 5;
            for (int j = 1; j <=5 ; j++,p--) {
                System.out.print(p+" ");

            }
            System.out.println();
        }
    }
}
