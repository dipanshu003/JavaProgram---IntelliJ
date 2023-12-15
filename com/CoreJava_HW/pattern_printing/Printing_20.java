package com.CoreJava_HW.pattern_printing;

public class Printing_20 {
    public static void main(String[] args) {

//        1 D 3 B 5
//        1 D 3 B 5
//        1 D 3 B 5
//        1 D 3 B 5
//        1 D 3 B 5

        for (int i = 1; i <=5 ; i++) {
            char p = 'A';
            for (int j = 1; j <=5 ; j++,p++) {
                if (j%2==0)
                {
                    System.out.print(p+" ");
                }
                else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
