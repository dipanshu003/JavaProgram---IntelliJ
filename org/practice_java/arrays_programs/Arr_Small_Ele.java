package org.practice_java.arrays_programs;

public class Arr_Small_Ele {
    public static void main(String[] args) {
        int arr[] = {3,52,1,35,66};
        System.out.println(min(arr));
    }

    public static int min(int[] arr)
    {
        int smallEle= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<smallEle)
            {
                smallEle=arr[i];
            }
        }
        return smallEle;
    }
}
