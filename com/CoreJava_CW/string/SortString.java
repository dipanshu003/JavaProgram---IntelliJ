package com.CoreJava_CW.string;


public class SortString {
    public static void main(String[] args) {
        String str = "dipanshu";
        sort(str);

    }
    public static void sort(String strArr)
    {
        char[] charArr = strArr.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = i+1; j < charArr.length ; j++) {
                if (charArr[i] > charArr[j])
                {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }

        System.out.println(new String(charArr));
    }
}
