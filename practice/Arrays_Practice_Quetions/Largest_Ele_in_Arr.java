package practice.Arrays_Practice_Quetions;

public class Largest_Ele_in_Arr {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,7};
        System.out.println(max(arr));
    }
    public static int max(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

}
