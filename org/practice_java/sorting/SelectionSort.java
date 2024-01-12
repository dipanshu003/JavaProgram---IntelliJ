package org.practice_java.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5};
        int a =getMax(arr,0, arr.length-1);
        System.out.println(a);
    }
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
        }
    }

    public static int getMax(int[]arr,int start ,int end)
    {
        int max = start;

        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
