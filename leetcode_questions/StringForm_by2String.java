package leetcode_questions;

import java.util.Arrays;

public class StringForm_by2String {
    public static void main(String[] args) {
        StringForm_by2String s = new StringForm_by2String();
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        System.out.println(s.isInterleave(s1, s2, s3));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        String newString = s1 + s2;
//        System.out.println(newString);
        char[] s3charArr = s3.toCharArray();
        char[] charArr = newString.toCharArray();
        sortString(charArr);
        sortString(s3charArr);
//        System.out.println(Arrays.toString(s3charArr));
//        System.out.println(Arrays.toString(charArr));


        if (s3charArr.length == charArr.length) {
            for (int i = 0; i < s3charArr.length;) {
                if (s3charArr[i] != charArr[i])
                {
                    return false;
                }
                else {
                    i++;
                }
            }
            return  true;
        }
        return false;
    }

    public void sortString(char[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] > charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;

                }
            }
        }
    }
}
