package com.CoreJava_CW.string;

public class PalindromeStr {
    public static void main(String[] args) {
        String str = "ava";

        System.out.println(palindrome(str));
    }

    public static String reverse(String str)
    {
        String newStr = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            newStr = newStr + str.charAt(i);
        }

        return newStr;
    }

    public static boolean palindrome(String str)
    {
        String str1 = reverse(str);
        if (str.equals(str1))
        {
            return true;
        }
        return false;
    }
}
