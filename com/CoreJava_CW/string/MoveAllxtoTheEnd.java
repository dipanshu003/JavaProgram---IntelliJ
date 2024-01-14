package com.CoreJava_CW.string;

public class MoveAllxtoTheEnd {
    public static void main(String[] args) {
        addAllxtoTheEnd("axdxca",'x');
    }

    public static void addAllxtoTheEnd(String string,char ele)
    {
        String appendAtr = "";
        char[] strArr=string.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            char ch = strArr[i];
            if (ch==ele)
            {
                appendAtr = appendAtr + ch;
            }
        }
        string=string.replace("x","");
        String newString = string+appendAtr;
        System.out.println(newString);
    }
}
