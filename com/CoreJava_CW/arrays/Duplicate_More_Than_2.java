package com.CoreJava_CW.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_More_Than_2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,2,5,2,3};
        duplicateGreater2(arr);
    }
    public static void duplicateGreater2(int[] arr)
    {
        Set<Integer> set =new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length ; j++) {

                if (arr[i]==arr[j])
                {
                    count++;
                    if (count>=2)
                    {
                        set.add(arr[i]);
                    }
                }


            }
        }
        System.out.println(set);
    }
}
