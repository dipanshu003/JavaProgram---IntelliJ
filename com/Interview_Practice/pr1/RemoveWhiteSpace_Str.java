package com.Interview_Practice.pr1;

public class RemoveWhiteSpace_Str {
    public static void main(String[] args) {
        removeWhiteSpace("Java By kiran");
    }
    public static void removeWhiteSpace(String string)
    {
        String string1=string.replace(" ","");
        System.out.println(string1);
    }
}
