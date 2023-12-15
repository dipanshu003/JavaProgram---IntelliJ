package com.Arrays_Practice_Quetions;

import java.util.Arrays;

public class Remove_Spedific_Ele_inArr {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5};
        removeEle(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void removeEle(int[] arr,int removeEle)
    {
       int indexToRemove=-1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]==removeEle)
            {
                indexToRemove=i;
                break;
            }
        }

       if (indexToRemove != -1)
       {
           for (int i = indexToRemove; i < arr.length-1 ; i++) {
               arr[i] = arr[i+1];
           }
           arr[arr.length-1] = 0;
       }
    }
}
