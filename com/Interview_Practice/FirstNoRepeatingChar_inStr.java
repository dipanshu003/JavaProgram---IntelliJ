package com.Interview_Practice;

public class FirstNoRepeatingChar_inStr {
    public static void main(String[] args) {
        String str = "Name is Khan";
        System.out.println(firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String str)
    {
        str=str.toLowerCase().replace(" ","");
        char[] charArray=str.toCharArray();
        for (int i = 0; i <charArray.length ; i++) {
            boolean isRepeat = false;
            for (int j = i+1; j <charArray.length ; j++) {
                if (charArray[i]==charArray[j])
                {
                    isRepeat = true;
                    break;
                }
            }

            if (!isRepeat)
            {
                return charArray[i];
            }
        }
        return ' ';
    }
}
