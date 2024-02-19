package com.Interview_Practice;

public class Capatilized_All_Char {
    public static void main(String[] args) {
        String str = "i am dipanshu";
        capitalizedAllChar(str);
    }

    public static void capitalizedAllChar(String string)
    {
        string=string.toUpperCase();
        System.out.println(string);
    }
}
