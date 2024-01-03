package leetcode_questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        reverse(str);
    }

    public static void reverse(String str)
    {
        char[] charArr= str.toCharArray();
        for (int i = charArr.length-1; i >=0 ; i--) {
            System.out.print(charArr[i]+" ");
        }
    }
}
