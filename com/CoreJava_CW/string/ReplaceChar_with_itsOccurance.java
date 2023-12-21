package com.CoreJava_CW.string;

import java.util.Arrays;

public class ReplaceChar_with_itsOccurance {
    public static void main(String[] args) {

        String str = "Deepanshu";
        replaceCharOccurance(str);

    }
    public static void replaceCharOccurance(String string)
    {
        char checkChar=0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <string.length() ; j++) {
                if (string.charAt(i) == string.charAt(j))
                {
                    checkChar=string.charAt(i);
                }
            }
//            System.out.println(checkChar);
        }

        int j = 1;

        char charArr[] = string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i]==checkChar)
            {
                charArr[i]=String.valueOf(j).charAt(0);
                j++;
            }
            System.out.print(charArr[i]);
        }
    }
}
