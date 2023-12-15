package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Kth_Smallest_Ele_Arr {
    public static void main(String[] args) {
        int arr[] = {4,6,2,8,1,3};
        System.out.println(kthSmallest(arr,5));
    }
    public static void sorting(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int kthSmallest(int arr[], int k)
    {
        sorting(arr);
        return arr[k-1];
    }
}
