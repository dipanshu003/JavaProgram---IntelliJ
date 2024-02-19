package com.Interview_Practice;

public class StringPresentInString {
    public static void main(String[] args) {
        String str1 = "Dipanshu";
        String str2 = "ansh";
        isStringPresentInString(str1,str2);
    }
    public static void isStringPresentInString(String str1,String str2)
    {
        boolean isContains=str1.contains(str2);

        if (isContains)
        {
            System.out.println("Present");
        }
        else {
            System.out.println("Not Present");
        }
    }
}
