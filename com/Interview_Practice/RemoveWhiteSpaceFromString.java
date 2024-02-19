package com.Interview_Practice;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args) {
        String str = "Dip an shu";
        removeWhiteSpace(str);
    }

    public static void removeWhiteSpace(String str)
    {
        str=str.replaceAll(" ","");
        str=str.replace(" ","");
        System.out.println(str);
    }
}
