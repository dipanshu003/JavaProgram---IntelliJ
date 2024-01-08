package leetcode_questions;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1,5,4};
        removeDuplicate(arr);
    }

    public static void removeDuplicate(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeat = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    isRepeat = true;
                    break;
                }
            }

            if (isRepeat == false)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
