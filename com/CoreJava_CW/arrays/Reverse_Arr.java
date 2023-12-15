package com.CoreJava_CW.arrays;

public class Reverse_Arr {
    int[] arr = {1,2,3,4,5};

    public static void main(String[] args) {
        Reverse_Arr r = new Reverse_Arr();
        reverse(r.arr);
    }
    public static void reverse(int[] arr)
    {
        for (int i = arr.length-1 ; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
