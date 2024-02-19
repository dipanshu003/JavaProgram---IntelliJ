package com.Interview_Practice;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "naman";
        System.out.println(isPalindromeString(str));
    }

    public static boolean isPalindromeString(String string)
    {
        String comStr = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            comStr = comStr+string.charAt(i);
        }

        if (string.equals(comStr))
        {
            return true;
        }
        return false;
    }
}
