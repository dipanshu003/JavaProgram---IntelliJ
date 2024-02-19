package com.Interview_Practice;

public class ToggleWords {
    public static void main(String[] args) {
        String str = "dipANsHu";
        toggleWords(str);
    }

    public static void toggleWords(String str)
    {
        char[] newCharArr=str.toCharArray();

        for (int i = 0; i < newCharArr.length; i++) {
            char currentChar=newCharArr[i];

            if (Character.isUpperCase(currentChar))
            {
                newCharArr[i]=Character.toLowerCase(currentChar);
            }
            else {
                newCharArr[i] = Character.toUpperCase(currentChar);
            }
        }

        String str1 = new String(newCharArr);
        System.out.println(str1);
    }
}
