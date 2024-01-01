package com.InterviewPre_String_Question;

public class FindNonRepeatingChar {
    public static void main(String[] args) {
        String str = "dippiyu";
        nonRepeatingChr(str);
    }

    public static void nonRepeatingChr(String string)
    {
        char[] chArr = string.toCharArray();
        for (int i = 0; i < chArr.length; i++) {//dippiyu
            int count = 0;
            for (int j = 0; j < chArr.length ; j++) {
                if (chArr[i]==chArr[j])
                {
                    count++;
                }
            }
            if (count==1)
            {
                System.out.print(chArr[i]);
            }
        }
    }
}
