package com.CoreJava_CW.string;

public class StringPresentInString {
    public static void main(String[] args) {
        String str1 = "abcdabcd";
        String str2 = "cdab";

        findString_in_String(str1,str2);
    }

    public static void findString_in_String(String str1,String str2)
    {
       int index = str1.indexOf(str2);
//        System.out.println(index);

        if (index == -1)
        {
            System.out.println("String not Present in String");
        }
        else {
            System.out.println("String Present in String");
        }
    }
}
