package com.CoreJava_CW.arrays;

import java.util.Arrays;

public class EvenStar_OddHash {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        printStarHash(arr);
    }

    public static void printStarHash(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2 == 0)
            {
                System.out.print("* ");
            }
            else {
                System.out.print("# ");
            }
        }
    }

}
