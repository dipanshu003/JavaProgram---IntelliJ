package com.MockTest;

public class PerfectSquare_InArr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        perfectSq(arr);
    }

    public static void  perfectSq(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int n=arr[i]*arr[i];
            {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j]==n)
                    {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}
