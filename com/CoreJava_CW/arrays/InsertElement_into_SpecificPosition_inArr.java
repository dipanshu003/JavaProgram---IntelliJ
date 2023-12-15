package com.CoreJava_CW.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement_into_SpecificPosition_inArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        insertSpecificPosition(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSpecificPosition(int[] arr)
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter Position Where you want to add Element : ");
        int i = x.nextInt();

        System.out.print("Enter Number What you want to add : ");
        int num = x.nextInt();

        if (i<= arr.length && i >= 1)
        {
            arr[i-1] = num;
        }
    }
}
