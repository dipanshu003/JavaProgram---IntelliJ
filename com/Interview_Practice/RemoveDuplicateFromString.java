package com.Interview_Practice;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str = "Dip Deep";
        removeDuplicate(str);
    }

    public static void removeDuplicate(String str) {
        str = str.toLowerCase().replace(" ", "");

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            boolean isRepeat = false;
            for (int j = i+1; j < charArray.length ; j++) {
                if (charArray[i]==charArray[j])
                {
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat)
            {
                System.out.print(charArray[i]);
            }

        }
    }
}
