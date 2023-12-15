package com.CoreJava_CW.arrays;

import java.util.Arrays;

public class MissingAndRepeating_Ele_in_Arr {
    public static void main(String[] args) {
        int[] arr = {4,2,1,2,5,4};
        missingAndRepeating(arr);
    }

    public static void missingAndRepeating(int[] arr)
    {
        SortingArr.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Missing Element Code
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] > 1 )
            {
                System.out.print("Missing Element is : "+(arr[i]+1));
            }
        }

        System.out.println();

        //Repeating Element Code

        System.out.print("Repeating Element is : ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count>0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
