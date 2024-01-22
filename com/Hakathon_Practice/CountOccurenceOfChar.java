package com.Hakathon_Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurenceOfChar {
    public static void main(String[] args) {
        String str = "DipPiyu";
        countCharOccurence(str);
    }
    public static void countCharOccurence(String string)
    {
        Map<Character,Integer> map = new LinkedHashMap<>();

        string =string.toLowerCase();//dippiyu
        char[] charArr=string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            int count = 0;
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[i]==charArr[j])
                {
                    count++;
                }
            }
//            System.out.println(charArr[i]+"->"+count);
            map.put(charArr[i],count);
        }

        System.out.println(map);
    }
}
