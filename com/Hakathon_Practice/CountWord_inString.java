package com.Hakathon_Practice;

public class CountWord_inString {
    static String str = "Dip Dhole";

    public static void main(String[] args) {
        System.out.println(countWord(str));
    }
    public static int countWord(String str)
    {
        int count =0;
        String[] strArr=str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            count++;
        }
        return count;
    }
}

