package org.practice_java.arrays_programs;

import java.util.Arrays;

public class PeakElem_NotSmallerThanNeigbors {
    public static void main(String[] args) {
        int arr[] = {11,3,23,44,2,12,3,54};
        peakElem(arr);
    }

    public static void peakElem(int arr[])
    {

        for (int i = 1; i <arr.length-1 ; i++)
        {
//            System.out.println(arr[i]);
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
            }
        }

        if (arr[0]>arr[1])
        {
            System.out.println(arr[0]);
        }
         if (arr[arr.length-1]>arr[arr.length-2]) {
            System.out.println(arr[arr.length-1]);
        }
    }
}
