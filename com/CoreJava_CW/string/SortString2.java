package com.CoreJava_CW.string;

public class SortString2 {
    public static void main(String[] args) {
        String str1 = "dipasnhu";
        sort(str1 );
    }
    public static void sort(String str1)
    {
        char[] chrArr = str1.toCharArray();

        for (int i = 0; i < chrArr.length; i++) {
            for (int j = i+1; j < chrArr.length; j++) {
                if (chrArr[i]>chrArr[j])
                {
                    char temp = chrArr[i];
                    chrArr[i] = chrArr[j];
                    chrArr[j] = temp;
                }
            }
        }
        System.out.println(chrArr);
    }
}
