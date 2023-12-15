package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Sort_Arr {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,2,2,1,0};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArr(int arr[] )
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j])
                {
                    //Swapping without third variable
                    arr[i] = arr[j]-arr[i];//3-4=-1
                    arr[j] = arr[j]-arr[i];//3-(-1) = 4
                    arr[i] = arr[i]+arr[j];//-1 + 4 = 3
                }
            }
        }
    }
}
