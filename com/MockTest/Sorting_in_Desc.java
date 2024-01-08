package com.MockTest;

import java.util.Arrays;

public class Sorting_in_Desc {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3};
        sortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void sortDesc(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
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
