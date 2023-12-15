package com.Arrays_Practice_Quetions;

public class Find_Second_Smallest_Ele_Arr {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1};
        System.out.println(secondSmallestEle(arr));
    }

    public static int secondSmallestEle(int[] arr)
    {
        int min = arr[0];
        int secondMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min)
            {
                secondMin=min;
                min=arr[i];
            }
        }
        return secondMin;
    }
}
