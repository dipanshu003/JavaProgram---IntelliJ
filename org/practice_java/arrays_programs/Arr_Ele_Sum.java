package org.practice_java.arrays_programs;

public class Arr_Ele_Sum {
    public static void main(String[] args) {
        Arr_Ele_Sum arrEleSum = new Arr_Ele_Sum();
        int[] arr = {2,4,6,8,10};
        System.out.println(arrEleSum.arrSum(arr));
    }

    public double arrSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}
