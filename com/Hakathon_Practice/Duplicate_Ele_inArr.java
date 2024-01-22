package com.Hakathon_Practice;

public class Duplicate_Ele_inArr {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,7,1,2};
        duplicateEle(arr);
    }
    public static void duplicateEle(int[]arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        }
    }
}
