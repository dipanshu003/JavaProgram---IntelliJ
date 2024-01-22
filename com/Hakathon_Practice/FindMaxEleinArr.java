package com.Hakathon_Practice;

public class FindMaxEleinArr {
    public static void main(String[] args) {
        int[]arr = {3,5,1};
        System.out.println(maxEle(arr));
    }

    public static int maxEle(int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max]<arr[i])
            {
                max=i;
            }
        }
        return arr[max];
    }
}
