package com.CoreJava_CW.string;

public class  CountDigitInString {
    public static void main(String[] args) {
        String name = "The Kiran Academy";
        int a = count(name);
        System.out.println(a);
    }

    public static int count(String name)
    {
        int count = 0;
        for (int i = 0; i <name.length(); i++) {
            if (name.charAt(i)!=' ')
            count++;
        }
        return count;
    }
}
