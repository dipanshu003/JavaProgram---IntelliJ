package com.CoreJava_CW.sorting.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {65,98,9,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            //find max ele and put it on the last index
            int lastLenght = arr.length-1-i;
            int maxIndex = getMax(arr,0,lastLenght);
            swap(arr,maxIndex,lastLenght);
        }
    }


    public static int getMax(int[] arr,int start,int end)
    {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }

    public static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
