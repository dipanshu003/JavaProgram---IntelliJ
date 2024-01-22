package com.Hakathon_Practice;

import java.util.Arrays;

public class AnagramsString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

//        System.out.println(anagramString(str1,str2));
        System.out.println(anagramString(str1,str2));
    }
    public static String sortStirng(String string)
    {
        char[] strArr=string.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 1; j < strArr.length-i; j++) {
                if (strArr[j-1]>strArr[j])
                {
                    char temp = strArr[j-1];
                    strArr[j-1] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        String str = new String(strArr);
        return str;
    }
    public static boolean anagramString(String str1, String str2)
    {
        String newStr1=sortStirng(str1);
        String newStr2=sortStirng(str2);
//        System.out.println(newStr1);
//        System.out.println(newStr2);

        if (newStr1.equals(newStr2))
        {
            return true;
        }
        return false;
    }
}
