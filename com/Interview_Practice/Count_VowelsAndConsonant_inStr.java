package com.Interview_Practice;

public class Count_VowelsAndConsonant_inStr {
    public static void main(String[] args) {
        String string = "This is Programming";
        countVowelsAndConsonant(string);
    }

    public static void countVowelsAndConsonant(String str)
    {
        int count = 0 ;
        char[] charArray=str.toCharArray();
        String vowels = "aeiou";

        for (char strChar : charArray)
        {
            for (int i = 0; i <vowels.length(); i++) {
                if (strChar==vowels.charAt(i))
                {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
