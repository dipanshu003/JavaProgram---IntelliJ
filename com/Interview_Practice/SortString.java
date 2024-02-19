package com.Interview_Practice;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "listen";
        sortString(str);
    }

    public static void sortString(String string)
    {
        char[] newCharArr=string.toCharArray();
        for (int i = 0; i < newCharArr.length; i++) {
            for (int j = 1; j < newCharArr.length-i ; j++) {
                if (newCharArr[j-1]>newCharArr[j])
                {
                    char temp = newCharArr[j-1];
                    newCharArr[j-1] = newCharArr[j];
                    newCharArr[j]  = temp;
                }
            }

        }

        String str = new String(newCharArr);
        System.out.println(str);
    }
}
