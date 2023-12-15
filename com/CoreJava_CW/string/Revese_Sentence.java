package com.CoreJava_CW.string;

import java.util.Arrays;

public class Revese_Sentence {
    public static void main(String[] args) {
        String str = "Java by Kiran";
        reverseSentence1(str);
    }

    public static void reverseSentence(String str){
        String[] strArr = str.split(" ");

        for (int i = strArr.length-1; i >=0 ; i--) {
            System.out.print(strArr[i]+" ");
        }
    }

    public static void reverseSentence1(String str)
    {
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
    }
}
