package com.Interview_Practice.pr1;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
