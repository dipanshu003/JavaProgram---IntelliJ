package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Negative_Ele_in_OneSide {
     static void main(String[] args) {
        int[] arr = {3,-2,4,-4,-3,82,-91};
        negEle(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void negEle(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>0 && arr[j]<0 )
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
