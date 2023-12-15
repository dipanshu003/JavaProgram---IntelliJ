package com.CoreJava_HW.sp_pattern;

public class SP_Printing_4 {
    public static void main(String[] args) {

//            *
//           **
//          ***
//         ****
//        *****

        int k= 1,sp =4;
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=sp ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=k ; j++) {
                System.out.print("*");
            }
            k++;
            sp--;
            System.out.println();
        }

        System.out.println();


//            *
//           * *
//          * * *
//         * * * *
//        * * * * *

        int k1= 1,sp1 =4;
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=sp1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=k1 ; j++) {
                System.out.print("* ");
            }
            k1++;
            sp1--;
            System.out.println();
        }

    }
}
