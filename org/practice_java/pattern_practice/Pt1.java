package org.practice_java.pattern_practice;

public class Pt1 {
    public static void main(String[] args) {
        int k = 1, sp = 4, m = 5;
        int sp1 = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j < k; j++) {
                System.out.print(" *");
            }

            System.out.println();

            k++;
            sp--;
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=m ; j++) {
                System.out.print(" *");
            }

            for (int j = 1; j <m ; j++) {
                System.out.print(" *");
            }
            sp1++;
            m--;
            System.out.println();
        }
    }
}
