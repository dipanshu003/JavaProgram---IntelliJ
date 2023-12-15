package com.CoreJava_CW.arrays;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Number_Greater_than_2 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2,3,2};
        findDuplicate(arr);
    }

    public static void findDuplicate(int[] arr)
    {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i] == arr[j])
                {
                    count++;

                    if (count>=2)
                    {
                        set.add(arr[i]);
                    }
                }
            }
        }
        System.out.println("Your Duplicate -> "+set);
    }
}
