package com.Interview_Practice;

public class CountChar_in_String {
    public static void main(String[] args) {
        String str = "   Dipanshu Dhole";
        countOfCharInString(str);
    }
    public static void countOfCharInString(String string)
    {
        string=string.replace(" ","");
        int count = 0;
        char[] charArr=string.toCharArray();
        for (int i = 0; i <charArr.length ; i++) {
            count++;
        }

        System.out.println(count);
    }
}
