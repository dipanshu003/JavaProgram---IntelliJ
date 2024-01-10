package leetcode_questions.stacks_question;

import java.util.Stack;

public class ReverseString_UsingStacks {
    public static void main(String[] args) {
        String str = "Dip";
        reverseString(str);
    }
    public static void reverseString(String string)
    {
        Stack<Character> stack = new Stack();

        char[] charArray=string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            stack.push(ch);
        }

        while (!stack.isEmpty())
        {
            char ch=stack.pop();
            System.out.print(ch);
        }
    }
}
