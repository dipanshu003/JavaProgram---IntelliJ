package com.Arrays_Practice_Quetions;

import java.util.Arrays;

public class CopyArray_into_Another_using_Iteration {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        copyArr(arr);
    }
    public static void copyArr(int[] arr)
    {
        int len = arr.length;
        int[] newArr = new int[len];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i]=arr[i];
        }
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("New Copied Array : "+Arrays.toString(newArr));
    }
}
