package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Rotate_Arr_Clockwise {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        rotate(arr);
        System.out.println("After Rotation Array : "+ Arrays.toString(arr));

    }

    public static void rotate(int[] arr)
    {
        int lastEle= arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = lastEle;
    }
}
