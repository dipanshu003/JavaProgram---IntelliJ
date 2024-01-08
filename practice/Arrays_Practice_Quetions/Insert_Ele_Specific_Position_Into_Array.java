package practice.Arrays_Practice_Quetions;

import java.util.Arrays;

public class Insert_Ele_Specific_Position_Into_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 1};
        insertEle(arr, 1, 9);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertEle(int[] arr, int position, int value) {
         if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
        }

        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = value;
    }
}
