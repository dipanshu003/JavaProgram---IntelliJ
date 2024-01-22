package com.Hakathon_Practice;

public class Capatilized_AllChar {
    public static void main(String[] args) {
        String str = "i love my country";
        convertIntoCapital(str);
    }

    public static void convertIntoCapital(String string)
    {
        string = string.toUpperCase();
        System.out.println(string);
    }
}
