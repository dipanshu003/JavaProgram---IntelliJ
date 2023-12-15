package com.Arrays_Practice_Quetions;

import java.util.Arrays;

public class Sort_Integer_and_String_Arr_1 {

    public static void main(String[] args) {
        int[] arrInt = {4,3,5,1,2};
        String[] arrStr = {"Rudra","Piyush","Vedu","Dipanshu"};

        sortArr(arrInt);
        System.out.println(Arrays.toString(arrInt));
    }

    public static void sortArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+i; j < arr.length ; j++) {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
