package leetcode_questions.stacks_question;

import java.util.Stack;

public class IsClosingOrNot_UsingStack {
    public static void main(String[] args) {
        String str = "(]";

        boolean isClosing = isProperClosing(str);
        System.out.println(isClosing);

    }

    public static boolean isProperClosing(String string) {
        Stack stack = new Stack();

        char[] charArray = string.toCharArray();

        //"(){}[]"

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            if (ch == ')' && stack.peek().equals('(') && !stack.isEmpty()) {
                stack.pop();

            } else if (ch == '}' && stack.peek().equals('{') && !stack.isEmpty()) {
                stack.pop();

            } else if (ch == ']' && stack.peek().equals('[') && !stack.isEmpty()) {
                stack.pop();

            } else {
                stack.push(ch);
            }

        }

        if (stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
