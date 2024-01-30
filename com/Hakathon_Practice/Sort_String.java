package com.Hakathon_Practice;

import java.util.Arrays;

public class Sort_String {
    public static void main(String[] args) {
        String str1 = "dipanshu";
        sortString(str1);
    }

    public static void sortString(String string)
    {
        char charArr[]=string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 1; j <charArr.length ; j++) {
                if (charArr[j-1]>charArr[j])
                {
                    char temp = charArr[j-1];
                    charArr[j-1] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }
    }
}
