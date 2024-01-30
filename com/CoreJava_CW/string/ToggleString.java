package com.CoreJava_CW.string;

public class ToggleString {
    public static void main(String[] args) {
        String input = "HeLLo, WoRLd!";
        String toggledString = toggleString(input);
        System.out.println("Original String: " + input);
        System.out.println("Toggled String: " + toggledString);
    }

    public static String toggleString(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            }
            // Ignore non-alphabetic characters
        }

        return new String(charArray);
    }
}
