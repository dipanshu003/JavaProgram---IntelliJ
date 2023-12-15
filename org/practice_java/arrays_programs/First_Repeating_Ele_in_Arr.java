package org.practice_java.arrays_programs;

import java.util.Arrays;

public class First_Repeating_Ele_in_Arr {
    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        System.out.println(firstRepeat(arr));
    }

    public static int firstRepeat(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
