package com.CoreJava_CW.arrays;

public class SecondLargestEle_2 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,3,1};
        secondLargest2(arr);
    }
    public static void secondLargest2(int[] arr)
    {
        int firstMax = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>firstMax)
            {
                secondMax = firstMax;
                firstMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
