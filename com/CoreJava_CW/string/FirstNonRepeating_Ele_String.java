package com.CoreJava_CW.string;

public class FirstNonRepeating_Ele_String {
    public static void main(String[] args) {
        String str = "AAcda";
        findFirstNonRepeatingEle(str);
    }

    public static void findFirstNonRepeatingEle(String string)
    {
        string=string.toLowerCase();//aacda
        for (int i = 0; i <string.length() ; i++) {//a
            boolean isRepeating = false;//false
            for (int j = i+1; j < string.length(); j++) {//a
                if (string.charAt(i)==string.charAt(j))//a==a
                {
                    isRepeating = true;
                    break;
                }

            }

            if (isRepeating==false)
            {
                System.out.println(string.charAt(i));
                break;
            }
        }
    }
}
