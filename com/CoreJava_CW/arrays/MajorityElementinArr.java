package com.CoreJava_CW.arrays;

public class MajorityElementinArr {
    public static void main(String[] args) {
        int[] arr = {3,4,2,3,3,4};
        System.out.println(majorityEle(arr));
    }


    public static int majorityEle(int[] arr)
    {
        int halfSize = (arr.length -1)/2;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count >= halfSize)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
