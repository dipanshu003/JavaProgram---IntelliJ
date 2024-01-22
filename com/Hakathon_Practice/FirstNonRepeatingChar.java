package com.Hakathon_Practice;

import java.util.Stack;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aaidcd";

        firstNonRepeatingChar(str);
    }

    public static void firstNonRepeatingChar(String string)
    {
        Stack<Character> stack = new Stack<>();
        char[] charArr=string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            boolean isRepeat = false;
            for (int j = i+1; j < charArr.length ; j++) {
                if (charArr[i]==charArr[j])
                {
                    isRepeat = true;
                    break;
                }
                stack.push(charArr[i]);
            }

            if (isRepeat==false)
            {
                System.out.print(charArr[i]);
                break;
            }
        }
    }
}
