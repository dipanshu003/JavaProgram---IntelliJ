package com.CoreJava_CW.arrays;

import java.util.Scanner;

public class  Accept_And_Display_2DArr {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        acceptAndPrint(arr);

    }
    public static void acceptAndPrint(int[][] arr)
    {
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print("Enter Your Number at index "+i+" "+j+" : ");
                arr[i][j] = x.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
