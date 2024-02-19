package com.Interview_Practice;

public class RemoveParticularString {
    public static void main(String[] args) {
        String str = "I am Dipanshu";
        removeParticularString(str);
    }
    public static void removeParticularString(String string)
    {
        string=string.toLowerCase();
         String[] newStr=string.split(" ");

        for (int i = 0; i < newStr.length; i++) {
            if (!newStr[i].equals("am"))
            {
                System.out.print(newStr[i]+" ");
            }
        }
    }
}
