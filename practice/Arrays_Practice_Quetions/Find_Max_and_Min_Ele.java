package practice.Arrays_Practice_Quetions;

public class Find_Max_and_Min_Ele {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        System.out.println("Maximum Number in Array : "+max(arr));
        System.out.println("Minimum Number in Array : "+min(arr));

    }

    public static int max(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
