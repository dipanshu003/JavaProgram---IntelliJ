package com.CoreJava_CW.arrays;

public class SecondLargestEle_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,4};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr)
    {
        for (int i = 0 ; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }
}
