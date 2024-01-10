package leetcode_questions.stacks_question;

import java.util.Stack;

public class ReverseArr_UsingStacks {
    public static void main(String[] args) {

        int [] arr = {2,4,1,5,6};
        reverseArr(arr);

    }

    public static void reverseArr(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
