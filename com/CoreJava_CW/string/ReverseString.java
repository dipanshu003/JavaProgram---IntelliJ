package com.CoreJava_CW.string;

public class ReverseString {
    public static void main(String[] args) {
        String str="Dipanshu Dhole";
        reverseString(str);

    }
    public static void reverseString(String str)
    {
        str = str.toLowerCase();
        char arr[] = str.toCharArray();
        int start =0;
        int end = str.length()-1;

        while (start<end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(arr);
    }
    public static String reverseStr(String str)
    {
        String  newStr = "";
        int len = str.length()-1;
        for (int i = len; i >=0 ; i--) {
            char ch  = str.charAt(i);
            newStr = newStr + ch;
        }
        return newStr;
    }
}
