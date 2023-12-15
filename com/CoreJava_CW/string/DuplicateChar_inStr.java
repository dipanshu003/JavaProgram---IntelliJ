package com.CoreJava_CW.string;

public class DuplicateChar_inStr {
    public static void main(String[] args) {
        String str = "Dipanshu Dhole";
        duplicateChar(str);
    }

    public static void duplicateChar(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j))
                {
                    System.out.print(str.charAt(i)+" ");
                }
            }
        }
    }
}
