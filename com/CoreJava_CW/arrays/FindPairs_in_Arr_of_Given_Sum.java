package com.CoreJava_CW.arrays;

import java.util.ArrayList;

public class FindPairs_in_Arr_of_Given_Sum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        findPairs(arr,9);
        findPairsBS(arr,8);
    }
    public static void findPairs(int[] arr,int sum)
    {
//        BruteForce Approach
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==sum)
                {
                    System.out.print("{"+arr[i]+","+ arr[j]+"}"+" ");
                }
            }
        }
    }

    //BinarySearch Approach
    public static void findPairsBS(int[] arr,int sum)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            if (arr[start]+arr[end]>sum)
            {
                end--;
            } else if (arr[start]+arr[end]<sum) {
                start++;
            }
            else if (arr[start]+arr[end]==sum)
            {
                System.out.print("{"+arr[start]+","+ arr[end]+"}"+" ");
                start++;
                end--;
            }
        }
    }
}
