package org.practice_java.sorting;

import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] arr = {-345,456,22,-54};
        simpleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void simpleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

