package com.CoreJava_CW.arrays;

import java.util.Scanner;

public class AcceptEven_Ele_In_Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        accept(arr);

    }

    public static void accept(int[] arr)
    {
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter Value at index "+i+" : ");
            int a = x.nextInt();
            if (a%2==0)
            {
                arr[i]=a;
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
