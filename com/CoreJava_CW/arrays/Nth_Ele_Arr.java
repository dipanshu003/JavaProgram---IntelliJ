package com.CoreJava_CW.arrays;

import java.util.Scanner;

public class Nth_Ele_Arr {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,9,4};
        while (true)
        {
            System.out.println("Your Element is : "+nthEle(arr));
        }
    }

    public static int nthEle(int[] arr)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your index to get Element : ");
        int n = x.nextInt();
        if (n>=0 && n<arr.length-1)
        {
            return arr[n];
        }
        else {
            return -1;
        }

    }
}
