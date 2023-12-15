package com.Arrays_Practice_Quetions;

public class FindPairs_inArr {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,3,8};
        findPair(arr,7);
    }

    public static void findPair(int[] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target)
                {
                    System.out.print(arr[i]+" "+arr[j]);
                    System.out.println();
                }
            }
        }
    }
}
