package com.Hakathon_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EveryCharCount_inString {
    public static void main(String[] args) {
        String str = "Dip piyu";
        countChar(str);
    }

    public static void countChar(String string)
    {

        Map<Character,Integer> map = new TreeMap<>();

        string=string.toLowerCase();
        string=string.replace(" ","");
        char[] charArr=string.toCharArray();
        for (int i = 0; i < charArr.length ; i++) {
            int count = 0;
            for (int j = 0; j < charArr.length ; j++) {
                if (charArr[i]==charArr[j])
                {
                    count++;
                }
            }
            map.put(charArr[i],count);
        }

        System.out.println(map);
    }
}
