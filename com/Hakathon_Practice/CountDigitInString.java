package com.Hakathon_Practice;

public class CountDigitInString {
    public static void main(String[] args) {
        String str= "Dipa123nshu";
        System.out.println("Digits Present in String = "+countDigit(str));
    }

    public static int countDigit(String string)
    {
        int count = 0;
        char[] num = {'1','2','3','4','5','6','7','8','9','0'};
        char[] charArr=string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < num.length ; j++) {

                if (charArr[i]==num[j])
                {
                    System.out.print(charArr[i]+" ");
                    count++;
                }
            }
        }
        System.out.println();
        return count;
    }
}
