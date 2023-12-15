package org.practice_java.arrays_programs;

public class Common_Element_in_3Arr {
    public static void main(String[] args) {
        int[] arr1 =  {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70,80, 120} ;

        commonIn3Arr(arr1,arr2,arr3);
    }

    public static  void commonIn3Arr(int[] arr1,int[] arr2 ,int[] arr3)
    {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j])
                {
//                    System.out.println(arr1[i]);
                    for (int k = 0; k < arr3.length; k++) {
                        if (arr1[i]==arr3[k])
                        {
                            System.out.println(arr1[i]);
                        }
                    }
                }
            }
        }
    }
}
