package org.practice_java.arrays_programs;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = {2,23,4,1};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverseArr(int arr[])
    {
       int start = 0;
       int end = arr.length-1;

       while (start<end)
       {
           arr[start] = arr[end]-arr[start];
           arr[end] = arr[end] -arr[start];
           arr[start] = arr[end] + arr[start];


           start++;
           end--;
       }
    }
}
