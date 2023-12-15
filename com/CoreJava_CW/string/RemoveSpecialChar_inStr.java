package com.CoreJava_CW.string;

public class RemoveSpecialChar_inStr {
    public static void main(String[] args) {
        String str = "!ja@va#90(My";
        removeSpecialChar2(str);
    }

    public static void removeSpecialChar1(String string)
    {
        String plainStr =string.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainStr);
    }
    public static void removeSpecialChar2(String string)
    {
        String newStr = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch>='A' && ch<='Z'||ch>='a' && ch<='z'||ch>=0 && ch<=9)
            {
                newStr = newStr + ch;
            }
        }

        System.out.println(newStr);
    }
}
