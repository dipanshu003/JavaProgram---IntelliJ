package org.practice_java.arrays_programs;

public class Duplicate_Ele_In_Arr {
    public static void main(String[] args) {
        int arr[] = {1,3,5,3,6,5,4};
        checkDuplicate(arr);
    }

    public static void checkDuplicate(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
