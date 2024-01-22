package com.Hakathon_Practice;

public class DuplicateChar_inStr {
    public static void main(String[] args) {
        String str= "Dip piyu";
        duplicateChar(str);
    }
    
    
    public static void duplicateChar(String string)
    {
        int count = 0;
        string=string.toLowerCase();//dip piyu
        string.replace(" ","");
        char[] charArr = string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i+1; j < charArr.length ; j++) {
                if (charArr[i]==charArr[j])
                {
                    count ++;
                    System.out.print(charArr[i]+" ");
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
