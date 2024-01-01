package com.Interview_Practice.pr1;

import java.util.Arrays;

public class Sum_of_2_Arr {
    public static void main(String[] args) {
        int [] arr1 = {2,3,4,2};
        int [] arr2 = {2,4,1,3};
        if (arr1.length != arr2.length)
        {
            System.out.println("Array Size Should be Same...");
        }
        else {
            System.out.println(Arrays.toString(addition2Arr(arr1,arr2)));
        }

    }

    public static int[] addition2Arr(int[] arr1,int[] arr2)
    {
        int len = arr1.length;
        int [] newArr = new int[len];
        for (int i = 0; i <arr1.length ; i++) {
            int sum = arr1[i]+arr2[i];
            newArr[i]=sum;
        }
        return newArr;
    }
}
