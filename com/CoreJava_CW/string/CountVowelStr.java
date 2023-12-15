package com.CoreJava_CW.string;

public class CountVowelStr {
    public static void main(String[] args) {

        String str = "My nAme is Khan";
        System.out.println(countVowel(str));
    }

    public static int countVowel(String str) {
        str=str.toLowerCase();
        int count = 0;
        String store = "aeiou";
        for (int i = 0; i < store.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (store.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
