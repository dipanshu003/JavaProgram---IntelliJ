package com.Interview_Practice;

public class RemoveSpecialCharFromString {
    public static void main(String[] args) {
        String str = "Dip$*@ans*()hu";
        removeSpecialChar2(str);
    }


    //Approach First
    public static void removeSpecialChar1(String string)
    {
        String newStr = "";
        char[] newCharArr=string.toCharArray();

        for (int i = 0; i < newCharArr.length ; i++) {
            char ch=newCharArr[i];

            if (ch >= 'A' && ch <= 'Z'  || ch >= 'a' && ch <= 'z' ||  ch >= 0 && ch <= 9  )
            {
                newStr+=ch;
            }
        }
        System.out.println(newStr);
    }

    //Approach Second

    public static void removeSpecialChar2(String str)
    {
        str=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str);
    }

}
