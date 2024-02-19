package com.Revision;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
       boolean isAna=  isAnagram(str1,str2);
        System.out.println(isAna);
    }
    public static boolean isAnagram(String str1,String str2)
    {
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(charArray1);
        System.out.println(charArray2);

        String newStr1 = new String(charArray1);
        String newStr2 = new String(charArray2);

        if (newStr1.equals(newStr2))
        {
            return true;
        }

        return false;

    }
}
