package practice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,15,5};
//        System.out.println(getMax(arr,0, arr.length-1));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1;
            int maxIndex = getMax(arr,0+i,last);
            swap(arr,i,maxIndex);
        }
    }

    public static int getMax(int[] arr,int start ,int end)
    {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max]< arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[]arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
