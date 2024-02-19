package com.Interview_Practice;


import java.util.Map;
import java.util.TreeMap;

public class CountEveryChar_inString {
    public static void main(String[] args) {
        String str = "Dip piyu";
        countEveryChar(str);
    }

    public static void countEveryChar(String str)
    {

        Map<Character,Integer> map = new TreeMap<>();
        str=str.toLowerCase().replace(" ","");
        char[] charArray=str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            for (int j = 0; j <charArray.length ; j++) {
                if (charArray[i]==charArray[j])
                {
                    count++;
                }

            }

            map.put(charArray[i],count);
        }

        System.out.println(map);
    }
}
