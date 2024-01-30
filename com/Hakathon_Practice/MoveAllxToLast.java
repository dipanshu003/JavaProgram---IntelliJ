package com.Hakathon_Practice;

public class MoveAllxToLast {
    public static void main(String[] args) {
        String str = "axdvxxd";
        moveAllxToLast(str);
    }

    public static void moveAllxToLast(String string)
    {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)!='x')
            {
                str1 += string.charAt(i);
            }
            else {
                str2 += string.charAt(i);
            }
        }

        String newStr = str1+str2;
        System.out.println(newStr);
    }
}
