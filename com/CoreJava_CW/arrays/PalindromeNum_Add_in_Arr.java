package com.CoreJava_CW.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeNum_Add_in_Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        paliNumAdd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void paliNumAdd(int[] arr)
    {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter Your Number at Index "+i+" : ");
            int n = x.nextInt();
            if (isPalimdrome(n))
            {
                arr[i]=n;
            }
            else {
                i--;
            }
        }
    }
    public static boolean isPalimdrome(int num)
    {
        int n = 0;
        int rev = 0;
        int temp = num;

        while (temp>0)
        {
            n = temp % 10;
            rev = (rev*10)+n;
            temp = temp /10;
        }

        if (num == rev)
        {
            return true;
        }
        return false;
    }
}
