package com.CoreJava_CW.string;

public class CapatilizedAll_Letter {
    public static void main(String[] args) {
        String str = "i love my country";
        System.out.println(capitalAll(str));
    }

    public static String capitalAll(String string)
    {
        String str=string.toUpperCase();
        return str;
    }
}
