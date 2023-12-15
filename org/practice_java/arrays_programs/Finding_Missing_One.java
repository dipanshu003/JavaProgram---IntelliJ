package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Finding_Missing_One {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,6};
        System.out.println("Before Array : "+ Arrays.toString(arr));
        sorting(arr);
        System.out.println("After Swapping Array : "+ Arrays.toString(arr));
        System.out.println("Missing Number : "+findMissing(arr));
    }

    public static void sorting(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j])
                {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static  int findMissing(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1]-arr[i]!=1)
            {
                return arr[i+1]-1;
            }
        }
        return 0;
    }
}
