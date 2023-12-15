package com.Arrays_Practice_Quetions;

public class Reverse_Integer_Arr {
    public static void main(String[] args) {
        int[] arr = {3,6,9};
        reverse(arr);
    }
    public static void reverse(int[] arr)
    {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
