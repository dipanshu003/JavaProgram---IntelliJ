package com.Interview_Practice;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "dip piyu";
        duplicateCharInString(str);
    }

    public static void duplicateCharInString(String str)
    {
        str=str.toLowerCase().replace(" ","");
        char[] charArray=str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i+1; j <charArray.length ; j++) {
                if (charArray[i]==charArray[j])
                {
                    System.out.println(charArray[i]);
                }
            }

        }
    }
}
