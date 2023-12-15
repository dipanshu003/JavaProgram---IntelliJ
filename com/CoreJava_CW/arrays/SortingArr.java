package com.CoreJava_CW.arrays;

import java.util.Arrays;

public class SortingArr {
    static int[] arr = {13,15,12,11,14};

    public static void main(String[] args) {
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j])
                {
//                    i=2 j=3
                    //swapping
                    arr[i] = arr[j] - arr[i]; //3-2 =1
                    arr[j] = arr[j] - arr[i];// 3- 1 = 2
                    arr[i] = arr[i] +arr[j];//1+2=3
                }
            }
        }
    }
}
