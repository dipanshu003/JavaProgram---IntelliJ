package com.CoreJava_CW.arrays;

public class Find_the_Average_ofArr {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,6};
        System.out.println(averageArr(arr));
    }

    public static double averageArr(int[] arr)
    {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total+arr[i];
        }
        double avg = total/arr.length;
        return avg;
    }
}
