package com.Arrays_Practice_Quetions;

import java.util.Scanner;

public class Addition_of_2_Matrices {
    public static void main(String[] args) {
//        int[][] arr1 = {{1,4},{2,3}};
//        int[][] arr2 = {{2,4},{3,5}};
//        addMatrice(arr1,arr2);

        int[][] arr = new int[3][3];
        acceptInMatrice(arr);
        dis(arr);
    }
    public static void addMatrice(int[][] arr1, int[][] arr2)
    {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                int sum= arr1[i][j]+arr2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }

    public static void acceptInMatrice(int[][]arr1)
    {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print("Enter Value at index "+i+" "+j+" : ");
                arr1[i][j] = x.nextInt();
            }
        }
    }

    public static void dis(int[][]arr1)
    {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
