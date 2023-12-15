package com.CoreJava_CW.string;

public class ToggleEachWord {
    public static void main(String[] args) {
        String str = "toggle each word";
        toggletheString(str);
    }
    public static void toggletheString(String string)
    {
        String str[] = string.split(" ");

        for (int i = 0; i < str.length; i++) {
            String comStr = str[i];
            for (int j = 0; j < comStr.length(); j++) {
                char ch = comStr.charAt(i);

            }
        }
    }
}
