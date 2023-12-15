package org.practice_java.arrays_programs;

import java.util.Arrays;

public class Arr_Even_Odd {
    public static void main(String[] args) {
        int[] arr = {2,45,1,3,5,26};
        System.out.println("Original Array : "+Arrays.toString(arr));
        System.out.println("Even Array : "+Arrays.toString(arrEven(arr)));
        System.out.println("Odd Array : "+Arrays.toString(arrOdd(arr)));
    }
    public static int[] arrEven(int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
            {
             count++;
            }
        }

        int[] evenArr = new int[count];
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 == 0)
            {
                evenArr[index] = arr[i];
                index++;
            }
        }
        return evenArr;
    }

    public static int[] arrOdd(int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1)
            {
                count++;
            }
        }

        int[] oddArr = new int[count];
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 == 1)
            {
                oddArr[index] = arr[i];
                index++;
            }
        }
        return oddArr;
    }
}
