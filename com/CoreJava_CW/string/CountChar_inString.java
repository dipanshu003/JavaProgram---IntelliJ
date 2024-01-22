package com.CoreJava_CW.string;

public class CountChar_inString {
    public static void main(String[] args) {
        String str = "The Kiran Accademy";
        System.out.println(countChar(str));
    }
    public static int countChar(String string)
    {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)!=' ')
            count++;
        }
        return count;
    }
}
