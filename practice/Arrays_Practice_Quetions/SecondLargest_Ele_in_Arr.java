package practice.Arrays_Practice_Quetions;

public class SecondLargest_Ele_in_Arr {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1,4};
        System.out.println(secondMax(arr));
    }

    public static int secondMax(int[] arr)
    {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max)
//            {3,2,5,6,1,4}
            {
                secondMax=max;
                max=arr[i];
            }
        }
        return secondMax;
    }
}
