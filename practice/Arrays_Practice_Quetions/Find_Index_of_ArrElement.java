package practice.Arrays_Practice_Quetions;

public class Find_Index_of_ArrElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(findValue(arr,2));
    }
    public static int findValue(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        while (start<end)
        {
            int mid = (start + (end-start))/2;

            if (target<arr[mid])
            {
                end--;
            } else if (target>arr[mid])
            {
                start++;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
