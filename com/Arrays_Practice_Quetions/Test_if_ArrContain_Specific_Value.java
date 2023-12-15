package com.Arrays_Practice_Quetions;

public class Test_if_ArrContain_Specific_Value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,5};
        System.out.println(containValue(arr,43));
     }

     public static boolean containValue(int[] arr,int value)
     {
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]==value)
             {
                 return true;
             }
         }
         return false;
     }

}
