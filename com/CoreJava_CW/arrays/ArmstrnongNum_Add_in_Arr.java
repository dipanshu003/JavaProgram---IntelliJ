package com.CoreJava_CW.arrays;

import com.CoreJava_CW.program.ArmstrongNumber;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrnongNum_Add_in_Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        acceptArmstrong(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void acceptArmstrong(int[] arr)
    {
        Scanner x  = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Your Number at Index "+i+" : ");
            int n = x.nextInt();

            if (ArmstrongNumber.isArmstrong(n))
            {
                arr[i]=n;
            }
            else {
                i--;
            }
        }
    }
}
