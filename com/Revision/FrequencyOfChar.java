package com.Revision;


import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "dip piyu";
        frequencyOfChar(str);
    }

    public static void frequencyOfChar(String str)
    {
        str=str.replace(" ","");
        Map<Character,Integer> map = new LinkedHashMap<>();
        char charArr[]=str.toCharArray();
        for (int i = 0; i <charArr.length; i++) {
            int count = 0;
            for (int j = 0; j <charArr.length ; j++) {
                if (charArr[i] == charArr[j])
                {
                    count++;
                }
                
            }
            map.put(charArr[i],count);
        }
        System.out.println(map);
    }
}
