package com.Interview_Practice;

public class MoveAllxToEnd {
    public static void main(String[] args) {
        String str = "anxxsdxm";
        moveAllxToEnd(str);
    }

    public static void moveAllxToEnd(String str) {

        String addedStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch=='x')
            {
                addedStr = addedStr+ch;
            }
        }


        str = str.replace("x", "");
        str = str+addedStr;
        System.out.println(str);
    }
}
