package com.CoreJava_CW.arrays;

public class Even_Ele_From_Arr {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        evenEle(arr);
    }


    public static void evenEle(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
