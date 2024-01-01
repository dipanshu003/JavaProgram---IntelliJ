package com.CoreJava_CW.string;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "java code";
        reverseEachWord(str);
    }

    public static void reverseEachWord(String string)
    {
        String strArr[]=string.split(" ");//[java, code]
//        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < strArr.length; i++) {
            String word = strArr[i];//java
            String newStr = "";
            for (int j = word.length()-1; j >=0 ; j--) {
                char ch = word.charAt(j);
                newStr = newStr + ch;
            }
            System.out.print(newStr+" ");
        }

    }
}
