package com.CoreJava_CW.string;

public class CountIn_Given_Str {
    public static void main(String[] args) {
        String str = "Dipanshu dhole";
        System.out.println(countWord(str));
    }
    public static int countWord(String str)
    {
        int count = 0;
        String strArr[] = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            count++;
        }
        return count;
    }
}
