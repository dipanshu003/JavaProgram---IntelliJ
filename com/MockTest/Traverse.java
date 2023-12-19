package com.MockTest;

public class Traverse {
    public static void main(String[] args) {

            int[] arr = {3,2,1,5};
        System.out.println(findSecondLargestEle2(arr));

    }
    public static void findSecondLargestEle1(int[] arr)
    {
        for(int i = 0 ; i <arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[arr.length -2]);
    }

    public static  int findSecondLargestEle2(int[] arr)
    {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max )
            {
                secondMax=max;
                max=arr[i];
            }
        }

        return secondMax;
    }
}
