package com.Hakathon_Practice;

public class Palindrome_String_Check {
    public static void main(String[] args) {
        System.out.println(isPalindromeStr("Noman"));
    }
    public static boolean isPalindromeStr(String string)
    {
        string=string.toLowerCase();
        String newStr="";
        for (int i = string.length()-1; i >=0 ; i--) {
            char ch=string.charAt(i);
            newStr+=ch;
        }
        if (newStr.equals(string))
        {
            return true;
        }
        return false;
    }
}
