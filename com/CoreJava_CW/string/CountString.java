package com.CoreJava_CW.string;

import java.util.Locale;

public class CountString {

    public static void main(String[] args) {
        String str = "Dipanshu Dhole, I Love my Country";
        countIori(str);

    }

    public static void countIori(String str)
    {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== 'i')
            {
                count++;
            }
        }
        System.out.println(count);
    }



    public static void countSpace(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void countSmallA(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println(count);
    }


}
