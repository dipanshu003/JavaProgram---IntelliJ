package practice.Interview_Practice.pr1;

public class LargestNumber_inArr {
    public static void main(String[] args) {
        int arr[] = {3,2,9,1};
        System.out.println(largestNumber2(arr));
    }
//    public static int largestNumber1(int [] arr)
//    {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max)
//            {
//                max=arr[i];
//            }
//        }
//        return max;
//    }

    public static int largestNumber2(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-1];
    }
}
