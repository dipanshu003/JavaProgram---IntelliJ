package com.CoreJava_CW.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Accept_Dispaly {
    public static void main(String[] args) {
        int[] arr = new int[3];
        accept(arr);
//        disp(arr);
        System.out.println(Arrays.toString(arr));
    }




    public static void accept(int[] arr)
    {
        Scanner x = new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("Enter Value at "+i+"th index : ");
            arr[i]= x.nextInt();
        }
    }
//
//    public static void disp(int[] arr)
//    {
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]);
//        }
//    }


}
