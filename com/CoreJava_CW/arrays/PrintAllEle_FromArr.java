package com.CoreJava_CW.arrays;

public class PrintAllEle_FromArr {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3};
        print(arr);
    }

    public static void print(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
