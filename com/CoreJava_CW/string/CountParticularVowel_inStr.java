package com.CoreJava_CW.string;

import java.util.Locale;

public class CountParticularVowel_inStr {
    public static void main(String[] args) {
        String str = "This is My New Car, Which is more Expensive";
        countParticularVowel(str);
    }

    public static void countParticularVowel(String str)
    {
        str = str.toLowerCase();
        String store = "aeiou";

        for (int i = 0; i <store.length() ; i++) {
            int count= 0;
            for (int j = 0; j < str.length(); j++) {
                if (store.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(store.charAt(i) + "-> "+count);
        }
    }
}
