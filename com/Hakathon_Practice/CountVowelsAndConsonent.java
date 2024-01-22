package com.Hakathon_Practice;

public class CountVowelsAndConsonent {
    public static void main(String[] args) {
        String str = "ram";
        countVandC(str);
    }

    public static void countVandC(String string)
    {
        int count = 0;
       char[] charArray= string.toCharArray();
       String vowel = "aeiou";
       char[] vowelCharArray = vowel.toCharArray();
        for (int i = 0; i < vowelCharArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (vowelCharArray[i]==charArray[j])
                {
                    count++;
                }
            }
        }

        System.out.println("Vowels : "+count);
        System.out.println("Cosonant : "+(string.length()-count));
    }
}
