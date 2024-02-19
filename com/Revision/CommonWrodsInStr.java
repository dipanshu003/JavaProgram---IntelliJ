package com.Revision;

import java.util.Arrays;

public class CommonWrodsInStr {
    public static void main(String[] args) {
        String str1 = "This is me";
        String str2 = "This is you";
        commonWordsInStr(str1,str2);
    }

    public static void commonWordsInStr(String str1,String str2)
    {
        String[] strChar1=str1.split(" ");
        String[] strChar2=str2.split(" ");

        for (int i = 0; i < strChar1.length; i++) {
            for (int j = 0; j < strChar2.length; j++) {

                if (strChar1[i].equals(strChar2[j]))
                {
                    System.out.println(strChar2[j]);
                }

            }
        }

    }
}
