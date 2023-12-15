package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Arr_Large_Ele {
    public static void main(String[] args) {
        int[] arr = {2,4,32,33,1};
        int maxNum = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>arr[0])
            {
                maxNum=arr[i];
            }
        }
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Maximum Value in Array : "+maxNum);
    }
}
