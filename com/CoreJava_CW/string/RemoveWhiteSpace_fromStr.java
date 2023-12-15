package com.CoreJava_CW.string;

public class RemoveWhiteSpace_fromStr {
    public static void main(String[] args) {
        String str = "Di pa       nsh u";
        removeWhiteSpace2(str);
    }

    public static void removeWhiteSpace1(String string)
    {
        int start = 0;
        int len = string.length()-1;
        String newStr = "";

        while (start<=len)
        {
            char ch=string.charAt(start);
            if (ch==' ')
            {
                start++;
            }
            else {
                newStr = newStr+ch;
                start++;
            }

        }
        System.out.println(newStr);
    }

    public static void removeWhiteSpace2(String string)
    {
        String space = " ";
        String repSpace = "";

        String newStr=string.replaceAll(space,repSpace);
        System.out.println(newStr);

    }
}
