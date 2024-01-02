package com.Interview_Practice.pr1;

public class SmallestEle_inArr {
    public static void main(String[] args) {
        int[] arr = {3,5,6};
        System.out.println(smallestEle(arr));

    }
    public static int smallestEle(int arr[])
    {
        int min= arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
