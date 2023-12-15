package com.MockTest;

public class DuplicateEle_Arr {
    public static void main(String[] args) {
        int[] arr = {3,4,2,3,4,5,2};
        duplicateEle(arr);
    }

    public static void duplicateEle(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
