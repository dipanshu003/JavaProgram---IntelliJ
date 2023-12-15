package com.CoreJava_HW.sp_pattern;

public class Pymarid_1 {
    public static void main(String[] args) {


//            1
//           232
//          34543
//         4567654
//        567898765

        int n = 5; // Change the value of n to adjust the number of rows in the pattern
        int spaces = n - 1;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line

            spaces--; // Reduce the number of spaces in the next row
        }
    }
}
