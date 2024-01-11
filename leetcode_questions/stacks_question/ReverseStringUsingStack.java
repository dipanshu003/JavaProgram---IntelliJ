package leetcode_questions.stacks_question;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str  = "Dipanshu Dhole";
        reverseString(str);
    }

    public static void reverseString(String string)
    {
        Stack stack = new Stack();

        char[] charArr = string.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]);
        }

        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}
