package org.practice_java.arrays_programs;

public class First_NonRepeating_Ele_in_Arr {
    public static void main(String[] args) {

        //Nhi bana tha ye...
        int[] arr = {1, 2, 2, 3, 0};
        System.out.println(firstNonRepeatingEle(arr));
    }
 
    public static int firstNonRepeatingEle(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
