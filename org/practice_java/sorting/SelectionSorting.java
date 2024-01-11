package org.practice_java.sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,4};
//        System.out.println(getMax(arr,0, arr.length-1));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
//            int maxIndex= getMax(arr,i+0,last);
//            swap(arr,i,maxIndex);

            int minIndex = getMin(arr,0,last);
            swap(arr,minIndex,last);

        }
    }

    public static void swap(int arr[] , int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMax(int[]arr,int start ,int end )
    {
        int max = start;

        for (int i = start; i <=end ; i++) {
            if (arr[max] < arr[i])
            {
               max= i;
            }
        }
        return max ;
    }
     public static int getMin(int[]arr,int start ,int end )
    {
        int min = start;

        for (int i = start; i <=end ; i++) {
            if (arr[min] > arr[i])
            {
               min= i;
            }
        }
        return min ;
    }

}
