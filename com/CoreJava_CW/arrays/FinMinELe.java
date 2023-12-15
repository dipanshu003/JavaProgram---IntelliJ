package com.CoreJava_CW.arrays;

public class FinMinELe {
    public static void main(String[] args) {
        int[] arr = {4,6,2,3,8};
        System.out.println(minEle(arr));
    }


    public static int minEle(int[] arr)
    {
        int minEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<minEle)
            {
                minEle=arr[i];
            }
        }
        return minEle;
    }
}
