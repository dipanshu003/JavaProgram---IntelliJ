package com.CoreJava_CW.arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,2,3};
        findDuplicate(arr);
    }

    public static void findDuplicate(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
