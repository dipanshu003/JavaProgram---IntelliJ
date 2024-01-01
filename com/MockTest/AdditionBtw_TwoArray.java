package com.MockTest;

import java.util.Arrays;

public class AdditionBtw_TwoArray {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,5};
        int arr2[] = {1,2,3,4};
        System.out.println(Arrays.toString(sumTwoArr(arr1,arr2)));
    }

    public static int[] sumTwoArr(int[] arr1,int[] arr2 )
    {
        int len = arr1.length;
        int sumArr[] = new int[len];
        for (int i = 0; i <len ; i++) {
            int sum = arr1[i]+arr2[i];
            sumArr[i] = sum;
        }

        return sumArr;
    }
}
