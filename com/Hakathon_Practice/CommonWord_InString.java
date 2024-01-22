package com.Hakathon_Practice;

public class CommonWord_InString {
    public static void main(String[] args) {
        String str1 = "This is Me";
        String str2 = "This is You";

        commonWord(str1,str2);
    }
    public static void commonWord(String str1,String str2)
    {
        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();

        String[] strArr1=str1.split(" ");
        String[] strArr2=str2.split(" ");

        for (int i = 0; i < strArr1.length; i++) {
            for (int j = 0; j < strArr2.length; j++) {
                if (strArr1[i].equals(strArr2[j]))
                {
                    System.out.print(strArr1[i]+" ");
                }
            }
        }

    }
}
