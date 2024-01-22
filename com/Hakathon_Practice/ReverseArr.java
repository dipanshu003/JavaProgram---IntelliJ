package com.Hakathon_Practice;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        reverseArr(arr);
    }

    public static void reverseArr(int[]arr )
    {

        for (int i = arr.length-1 ;i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
