package org.practice_java.arrays_programs;

public class Count_Pairs_With_Given_Sum {
    public static void main(String[] args) {
        int arr[] = {5,4,6,2,8,-1,1,7};
        System.out.println(pairs(arr,9));
    }

    public static int pairs(int[] arr,int pair)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] + arr[j] == pair)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
