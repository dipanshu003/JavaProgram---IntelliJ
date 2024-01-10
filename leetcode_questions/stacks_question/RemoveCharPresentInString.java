package leetcode_questions.stacks_question;

import java.util.Stack;

public class RemoveCharPresentInString {
    public static void main(String[] args) {
        String firstStr = "computer";
        String secondStr = "cat";
        removeChar(firstStr,secondStr);
    }

    public static  void removeChar(String string1,String string2)
    {
        Stack<Character> stack = new Stack<>();

        char[] firstCharArr=string1.toCharArray();
        char[] secondCharArr=string2.toCharArray();

        for (int i = 0; i < secondCharArr.length; i++) {
            stack.push(secondCharArr[i]);
        }
        System.out.println(stack);

        for (int i = 0; i <firstCharArr.length; i++) {
            if (!(stack.peek() == firstCharArr[i]))
            {
                System.out.print(firstCharArr[i]);
            }
        }
        stack.pop();

//        char stackPeek=stack.peek();
//        for (int i = 0; i < firstCharArr.length; i++) {
//            if (!(firstCharArr[i]==stackPeek))
//            {
//                System.out.print(firstCharArr[i]);
//            }
//            stack.pop();
//        }

    }
}
