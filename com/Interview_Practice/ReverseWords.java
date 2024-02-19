package com.Interview_Practice;

import javafx.print.Collation;

import java.util.Collections;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "My name is Khan";
        reverseStringWrod(str);
    }

    public static void reverseStringWrod(String str)
    {
        String[] newStr=str.split(" ");
        for (int i = newStr.length-1 ; i >=0 ; i--) {
            System.out.print(newStr[i]+" ");
        }
    }
}
