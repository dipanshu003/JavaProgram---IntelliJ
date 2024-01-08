package practice.Arrays_Practice_Quetions;

public class FindDuplicate_Values_inStringArr {
    public static void main(String[] args) {
        String[] arr = {"Dip","Piyu","Mohan","Dip"};
        findDuplicate(arr);
    }

    public static void findDuplicate(String[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}
