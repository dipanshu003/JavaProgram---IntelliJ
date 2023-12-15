package com.Arrays_Practice_Quetions;

public class Sum_Values_in_Arr_2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int sum = sumValues(arr);
        System.out.println(sum);
    }

    public static int sumValues(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
