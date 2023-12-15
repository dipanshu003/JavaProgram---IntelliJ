package com.CoreJava_CW.arrays;

import java.util.Arrays;

public class Copy_Arr_by_Iterating_Arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(copyIterating(arr)));
    }

    public static int[] copyIterating(int[] arr)
    {
        int lenght = arr.length;

        int[] newArr = new int[lenght];
        for (int i = 0; i <arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
}
