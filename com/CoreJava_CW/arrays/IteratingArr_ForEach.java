package com.CoreJava_CW.arrays;

import java.util.Arrays;

public class IteratingArr_ForEach {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 7};

//        for (int i : arr)
//        {
//            System.out.println(i);
//        }


        Arrays.stream(arr).filter(i->i>5).forEach(i-> System.out.println(i));
    }
}
