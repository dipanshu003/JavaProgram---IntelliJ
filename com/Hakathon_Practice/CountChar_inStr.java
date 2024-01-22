package com.Hakathon_Practice;

public class CountChar_inStr {
    public static void main(String[] args) {
        String str = "Dipanshu";
        System.out.println(countChar(str));
    }

    public static int countChar(String str)
    {
        int count =0;
        char[] charArr=str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i]!=' ')
            {
                count++;
            }
        }
        return count;
    }
}
