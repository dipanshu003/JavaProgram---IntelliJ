package com.MockTest;

public class ReverseInWords {

    public static void main(String[] args) {
        String str = "The Kiran Academy Pune";
        reverseWord(str);
    }

    public static void reverseWord(String string)
    {
        String[] strArr =string.split(" ");

        for (int i = strArr.length-1; i >=0 ; i--) {
            System.out.print(strArr[i]+" ");
        }
    }
}
