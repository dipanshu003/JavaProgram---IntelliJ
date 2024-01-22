package com.Hakathon_Practice;

public class SumOfEle_inArr {
    public static void main(String[] args) {
        int[] arr = {3,6,1,7};
        System.out.println(sumofEle(arr));
    }

    public static int sumofEle(int[]arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}
