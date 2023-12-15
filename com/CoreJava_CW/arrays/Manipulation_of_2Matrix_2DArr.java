package com.CoreJava_CW.arrays;

import java.util.Scanner;

public class Manipulation_of_2Matrix_2DArr {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];

//        int[][]arr1 = {{1,2},{4,3}};
//        int[][]arr2 = {{1,2},{4,3}};



        System.out.println("\t ***Enter Elements in First 2D Array***");
        System.out.println();
        accept(arr1);

        System.out.println("\t ***Enter Elements in Second 2D Array***");
        System.out.println();
        accept(arr2);

        System.out.println("First 2D Array : ");
        print(arr1);

        System.out.println("Second 2D Array : ");
        print(arr2);

        System.out.println("Addition of Both Array is : ");
        sumOf2dArr(arr1,arr2);

        System.out.println("Subtraction of Both Array is : ");
        subOf2dArr(arr1,arr2);

        System.out.println("Multiplication of Both Array is : ");
        multiOf2dArr(arr1,arr2);


    }

    public static void accept(int[][] arr)
    {
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter Element at index "+i+" "+j+" : ");
                arr[i][j] = x.nextInt();
            }
        }
        System.out.println();
    }

    public static void print(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sumOf2dArr(int[][] arr1 , int[][] arr2)
    {
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                int sum = arr1[i][j]+arr2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }

    public static void subOf2dArr(int[][] arr1 , int[][] arr2)
    {
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                int sub = arr1[i][j]-arr2[i][j];
                System.out.print(sub+" ");
            }
            System.out.println();
        }
    }
    public static void multiOf2dArr(int[][] arr1 , int[][] arr2)
    {
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                int multi = arr1[i][j]*arr2[i][j];
                System.out.print(multi+" ");
            }
            System.out.println();
        }
    }
}
