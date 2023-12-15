package com.CoreJava_CW.arrays;

public class PrintNonRepeatingEle {
    public static void main(String[] args) {
        int[] arr = {14,19,2,5,12,14,5};
        nonRepeat(arr);
    }

    public static void nonRepeat(int[] arr)
    {
//        SortingArr.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0   ; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    count++;
                }
            }
            if (count<2)
            {
                System.out.print(arr[i]+" ");
            }

        }
    }
}

