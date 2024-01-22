package com.Hakathon_Practice;

public class Reverse_a_String {
    public static void main(String[] args) {
        System.out.println(reverseStr("dip"));
    }
    public static String reverseStr(String string)
    {
        String newStr = "";

        for (int i = string.length()-1; i >=0 ; i--) {
            char ch=string.charAt(i);
            newStr+=ch;
        }
        return newStr;
    }
}
