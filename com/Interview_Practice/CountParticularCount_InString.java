package com.Interview_Practice;

public class CountParticularCount_InString {
    public static void main(String[] args) {
        String str = "I Wanna be a Good Programmer in IT Industry ";
        countOfParticularVowelInString(str);
    }
    public static void countOfParticularVowelInString(String string)
    {
        string=string.toLowerCase();
        String vowels = "aeiou";
        char[] charArr=string.toCharArray();

        for (int i = 0; i < vowels.length(); i++) {
            int count = 0;

            for (char ch : charArr)
            {

                if (ch==vowels.charAt(i))
                {
                    count++;
                }

            }
            System.out.println(vowels.charAt(i)+" - > "+count);
        }
    }
}
