package com.Interview_Practice;

public class CountWordInString {
    public static void main(String[] args) {
        String string = "I am Dipanshu";
        System.out.println(countWordInString(string));
    }

    public static int countWordInString(String str)
    {
        int count = 0;
        String[] strArr=str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            count++;
        }

        return count;
    }
}
