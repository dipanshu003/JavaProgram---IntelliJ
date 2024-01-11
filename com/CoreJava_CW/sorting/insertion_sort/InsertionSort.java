package com.CoreJava_CW.sorting.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i+1 ; j++) {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] =temp;
                }
            }
        }
    }
}
