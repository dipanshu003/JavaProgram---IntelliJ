package leetcode_questions;

public class FindPairsOfK {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        findPairs2(arr, 8);
    }

//    public static void findPairs1(int[] arr , int k)
//    {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]+arr[j]==k)
//                {
//                    System.out.println(arr[i]+","+arr[j]+" ");
//                }
//            }
//        }
//    }

    public static void findPairs2(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] == k) {
                System.out.println(arr[start] + "," + arr[end] + " ");
                start++;
                end--;
            } else if (arr[start] + arr[end] < k) {
                start++;
            } else {
                end--;
            }
        }
    }

}
