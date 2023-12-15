package com.CoreJava_CW.arrays;

public class PrintRepeatingEle {
    public static void main(String[] args) {
        int [] arr = {5,3,5,7,8,3};
        printRepeatingEle(arr);
    }

    public static void printRepeatingEle(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            int count =0 ;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    count++;
                }
            }
            if (count>=1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
