package com.Interview_Practice;

public class CommonWordsInStrings {
    public static void main(String[] args) {
        String str1 = "He is a Developer";
        String str2 = "She is a Programmer";

        commonWordsInString(str1,str2);
    }

    public static void commonWordsInString(String str1,String str2)
    {

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        String[] strArr1=str1.split(" ");
        String[] strArr2=str2.split(" ");

        for (int i = 0; i < strArr1.length; i++) {
            String word1 = strArr1[i].trim();
            for (int j = 0; j <strArr1.length ; j++) {
                String word2 = strArr2[j];
                if (word1.equals(word2))
                {
                    System.out.println(word1);
                }
            }
        }
    }
}
