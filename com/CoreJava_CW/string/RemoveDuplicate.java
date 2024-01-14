package com.CoreJava_CW.string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "dippiyu";
        removeDuplicate(str);
    }

    public static void removeDuplicate(String string)
    {
       char[] charArr= string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char ch=charArr[i];
            boolean isRepeated = false;
            for (int j = i+1; j <charArr.length ; j++) {
                if (ch==charArr[j])
                {
                    isRepeated= true;
                    break;
                }
            }

            if (isRepeated == false)
            {
                System.out.print(charArr[i]);
            }
        }
    }
}
