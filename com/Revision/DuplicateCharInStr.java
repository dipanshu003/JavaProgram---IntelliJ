package com.Revision;

public class DuplicateCharInStr {
    public static void main(String[] args) {
        String string = "dip piyu";
        duplicateChar(string);
    }

    public static void duplicateChar(String str)
    {
        char charArray[]=str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i+1; j <charArray.length ; j++) {
                if (charArray[i]==charArray[j])
                {
                    System.out.print(charArray[i]+" ");
                }
            }
        }
    }
}
