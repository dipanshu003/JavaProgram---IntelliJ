package org.practice_java.arrays_programs;

public class Binary_Search_program {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr,5));
    }

    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while (start<end)
        {
            int mid = end - (end-start)/2;

            if (target > arr[mid])
            {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

}
