package com.CoreJava_CW.arrays;

public class CommonEle_in_2Arr {
    public static void main(String[] args) {
        int[] arr1 = {4,6,7,2,1};
        int[] arr2 = {5,9,10,2,4};

        commonEle(arr1,arr2);
    }

    public static void commonEle(int[] arr1,int[] arr2)
    {
        System.out.print("Your Common Element in Two Arrays is : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
