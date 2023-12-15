package com.CoreJava_CW.arrays;

public class PrintOdd_IndexEle {
    public static void main(String[] args) {
        int[] arr = {2,34,2,7,78};
        oddIdxEle(arr);
    }

    public static void oddIdxEle(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
