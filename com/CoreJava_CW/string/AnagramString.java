package com.CoreJava_CW.string;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
//        System.out.println(sortString(str1));
        anagramStr(str1,str2);
     }

     public static String sortString(String str)
     {
         char[] charArr1 = str.toCharArray();

         for (int i = 0; i < charArr1.length; i++) {
             for (int j = i+1; j < charArr1.length; j++) {
                 if (charArr1[i]>charArr1[j])
                 {
                     char temp = charArr1[i];
                     charArr1[i] = charArr1[j];
                     charArr1[j] = temp;
                 }
             }
         }

         //store char array into string object
         String str1 = new String(charArr1);

         return new String(str1);
     }

     public static void anagramStr(String str1, String str2)
     {
         String sortStr1 = sortString(str1);
         String sortStr2 = sortString(str2);

         if (sortStr1.equals(sortStr2))
         {
             System.out.println("Both String is Anagram");
         }
         else {
             System.out.println("Both String is not Anagram");
         }
     }
}
