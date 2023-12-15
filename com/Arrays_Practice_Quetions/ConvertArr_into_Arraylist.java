package com.Arrays_Practice_Quetions;

import java.util.ArrayList;
import java.util.List;

public class ConvertArr_into_Arraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        convertIntoArraylist(arr);
    }
    public static void convertIntoArraylist(int[] arr)
    {
        List list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
             list.add(arr[i]);
        }

        System.out.println("This is ArrayList -> "+list);
    }
}
