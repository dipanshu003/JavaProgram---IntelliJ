package org.practice_java.arrays_programs;

public class Sum_of_subArr_in_Arr {
    Sum_of_subArr_in_Arr a = new Sum_of_subArr_in_Arr();
    int x = 10;

    public static void main(String[] args) {
        int arr[]= {3,4,2,5,1,9};
        System.out.println(subArrSum(arr,2,4));
    }

    public static int subArrSum(int arr[] , int startIndex , int endIndex)
    {
        int sum  = 0;
        for (int i = startIndex; i <=endIndex ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
