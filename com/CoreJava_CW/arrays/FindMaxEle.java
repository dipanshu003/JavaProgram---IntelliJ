package com.CoreJava_CW.arrays;

public class FindMaxEle {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,1,4};
        System.out.println("Max Element in array is : "+maxEle(arr));
    }

    public static int maxEle(int[] arr)
    {
        int maxEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxEle )
            {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
}
