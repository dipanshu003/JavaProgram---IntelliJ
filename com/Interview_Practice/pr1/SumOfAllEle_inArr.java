package com.Interview_Practice.pr1;

public class SumOfAllEle_inArr {
    public static void main(String[] args) {
        int [] arr = {2,4,5,2,1};
        System.out.println(sumOfArrEle(arr));
    }
    public static int sumOfArrEle(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}
