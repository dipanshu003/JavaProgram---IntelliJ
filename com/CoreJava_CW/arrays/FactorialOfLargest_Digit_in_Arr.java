package com.CoreJava_CW.arrays;

public class FactorialOfLargest_Digit_in_Arr {
    public static void main(String[] args) {
        int[] arr = {4,6,2,3,1};
        System.out.println(factorial(arr));
    }

    public static int max(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static int factorial(int[] arr)
    {
        int max = max(arr);
        int fact = 1;
        for (int i = 1; i <=max ; i++) {
            System.out.print(i+" ");
            fact = fact * i;
        }
        System.out.println();
        return fact;
    }
}
