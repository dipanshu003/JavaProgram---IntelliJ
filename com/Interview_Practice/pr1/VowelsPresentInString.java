package com.Interview_Practice.pr1;

public class VowelsPresentInString {
    public static void main(String[] args) {
        String str = "dp";
        System.out.println(isVowelPresent(str));
    }
    public static boolean isVowelPresent(String str)
    {
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (vowels.charAt(i)==str.charAt(j))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
