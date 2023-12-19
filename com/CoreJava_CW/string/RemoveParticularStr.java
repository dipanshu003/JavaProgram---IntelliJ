package com.CoreJava_CW.string;

import java.util.Arrays;
import java.util.Locale;

public class RemoveParticularStr {
    public static void main(String[] args) {
        String str = "Java is not best academy";
        str=str.toLowerCase(Locale.forLanguageTag(str));
        replaceIs(str);
    }
    public static void replaceIs(String str)
    {
        String rep = "";
        String[] strChararr = str.split(" ");
        for (int i = 0; i < strChararr.length; i++) {
           if (!strChararr[i].equals("is"))
           {
               System.out.print(strChararr[i]+" ");
           }
        }
    }
}
