package com.CoreJava_HW.pattern_printing;

public class Printing_8 {
    public static void main(String[] args) {

//        1 # 3 # 5
//        1 # 3 # 5
//        1 # 3 # 5
//        1 # 3 # 5
//        1 # 3 # 5
//
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (j%2==0)
                {
                    System.out.print(" # ");
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();

        }
    }
}
