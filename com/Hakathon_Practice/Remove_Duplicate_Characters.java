package com.Hakathon_Practice;

public class Remove_Duplicate_Characters {
    public static void main(String[] args) {
        String str = "DipPiyu";
        removeDuplicateChar(str);
    }

    public static void removeDuplicateChar(String string) {
        string=string.toLowerCase();
        char[] charArr= string.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            boolean isRepeat = false;
            for (int j = i+1; j < charArr.length ; j++) {
                if (charArr[i]==charArr[j])
                {
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat==false)
            {
                System.out.print(charArr[i]);
            }
        }
    }
}
