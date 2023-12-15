package com.CoreJava_CW.arrays;

import java.util.Scanner;

public class AcceptEvenEle_In_Full_Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        accept(arr);
    }

    public static void accept(int[] arr)
    {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Value at index "+i+" : ");
            int n = x.nextInt();

            if (n%2 == 0)
            {
                arr[i]=n;
            }
            else {
                i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
