package com.CoreJava_CW.arrays;

public class PrintEven_IndexEle {
    public static void main(String[] args) {
        int[] arr = {2,34,2,7,78};
        evenIdxEle(arr);
    }

    public static void evenIdxEle(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
