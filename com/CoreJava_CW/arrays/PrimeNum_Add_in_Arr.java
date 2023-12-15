package com.CoreJava_CW.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNum_Add_in_Arr {
    public static void main(String[] args) {
        int[] arr = new int [5];
        primeNumAdd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void  primeNumAdd(int[] arr)
    {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter Your Number at Index "+i+" : ");
            int n = x.nextInt();
            if (primeOrNot(n))
            {
                arr[i]=n;
            }
            else {
                i--;
            }
        }
    }

    public static boolean primeOrNot(int n)
    {
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0)
            {
                count++;
            }
        }

        if (count==2)
        {
            return true;
        }
        return false;
    }
}
