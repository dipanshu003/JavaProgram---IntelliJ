package com.CoreJava_CW.string;

import java.util.Locale;

public class CommonWordinStr {
    public static void main(String[] args) {
        String str1 = "This is Pune";
        String str2 = "This is Devi";
        str1 = str1.toLowerCase(Locale.forLanguageTag(str1));
        str2 = str2.toLowerCase(Locale.forLanguageTag(str2));

        commonWord(str1,str2);
    }

    public static void commonWord(String str1,String str2)
    {
        String[] str1Arr = str1.split(" ");
        String[] str2Arr = str2.split(" ");

        for (int i = 0; i <str1Arr.length; i++) {
            for (int j = 0; j < str2Arr.length; j++) {
              if (str2Arr[j].equals(str1Arr[i]))
              {
                  System.out.print(str1Arr[i]+" ");
              }
            }
        }

    }
}
