package com.InterviewPre_String_Question;

public class ReplaceCharWithOccurance {
    public static void main(String[] args) {
        String str = "dippiyu";
        String result = replaceCharWithOccurrence(str);
        System.out.println(result);
    }

    public static String replaceCharWithOccurrence(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            int count = 1; // Start the count at 1 for the current character
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
            result.append(string.charAt(i)).append(count);
        }

        return result.toString();
    }
}