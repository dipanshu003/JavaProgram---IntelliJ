package com.Interview_Practice;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        boolean a = isAnagram(str1,str2);
        System.out.println(a);
    }

    public static boolean isAnagram(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] str1CharArray=str1.toCharArray();
        char[] str2CharArray=str2.toCharArray();

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        String newStr1 = new String(str1CharArray);
        String newStr2 = new String(str2CharArray);

        if (newStr1.equals(newStr2))
        {
            return true;
        }

        return false;
    }
}
