package com.CoreJava_HW.pattern_printing;

public class Printing_17 {
    public static void main(String[] args) {

//        A 2 C 4 E
//        A 2 C 4 E
//        A 2 C 4 E
//        A 2 C 4 E
//        A 2 C 4 E

        for (int i = 1; i <=5 ; i++) {
            char p = 'A';
            for (int j = 1; j <=5 ; j++,p++) {
                if (j%2==0)
                {
                    System.out.print(j+" ");
                }
                else
                {
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }

    }
}
