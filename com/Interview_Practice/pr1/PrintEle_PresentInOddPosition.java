package com.Interview_Practice.pr1;

public class PrintEle_PresentInOddPosition {
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3};
        oddPositionEle(arr);
    }
    public static void oddPositionEle(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            if (i%2==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
