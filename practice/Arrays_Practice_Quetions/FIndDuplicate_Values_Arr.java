package practice.Arrays_Practice_Quetions;

public class FIndDuplicate_Values_Arr {
    public static void main(String[] args) {
        int[] arr = {3,2,5,2,1,3};
        findDuplicate(arr);
    }
    public static void findDuplicate(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}
