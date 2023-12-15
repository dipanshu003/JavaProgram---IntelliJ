package org.practice_java.arrays_programs;

public class ELe_Occurance_Arr {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,4,4};
        System.out.println(eleOccurCount(arr,4));
    }

    public static int eleOccurCount(int arr[],int ele)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ele)
            {
                count++;
            }
        }
        return count;
    }
}
