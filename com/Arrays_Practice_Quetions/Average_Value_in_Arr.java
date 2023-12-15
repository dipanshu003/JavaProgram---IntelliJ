package com.Arrays_Practice_Quetions;

public class Average_Value_in_Arr {
    public static void main(String[] args) {
        int[] arr = {2,3,4,22,4};
        System.out.println(avgValue(arr));
    }
    public static double avgValue(int[] arr)
    {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total+arr[i];
        }
        double avg = total/ arr.length;
        return avg;
    }
}
