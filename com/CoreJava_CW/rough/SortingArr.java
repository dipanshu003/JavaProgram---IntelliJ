package com.CoreJava_CW.rough;

import java.util.Arrays;

public class SortingArr {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j])
                {
                    int temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
