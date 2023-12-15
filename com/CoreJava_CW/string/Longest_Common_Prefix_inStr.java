package com.CoreJava_CW.string;

public class Longest_Common_Prefix_inStr {
    public static void main(String[] args) {
        String[] strArr = {"apple", "ape", "apps"};
        longestCommonPrefix(strArr);
    }

    public static void longestCommonPrefix(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            System.out.println("No common prefix");
            return;
        }

        String str1 = strArr[0]; // apple
        String str2 = strArr[1]; // ape
        String newStr = "";

        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                char ch = str1.charAt(i);
                newStr = newStr + ch;
            } else {
                break;
            }
        }

        String newStrMain = "";

        for (int i = 2; i < strArr.length; i++) {
            String str = strArr[i];
            int j = 0;
            while (j < newStr.length() && j < str.length() && newStr.charAt(j) == str.charAt(j)) {
                char ch = str.charAt(j);
                newStrMain = newStrMain + ch;
                j++;
            }
        }

        System.out.println("Longest Common Prefix String Array : " + newStrMain);
    }
}
