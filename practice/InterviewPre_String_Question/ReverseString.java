package practice.InterviewPre_String_Question;

public class ReverseString {
    public static void main(String[] args) {
        char charArr[] = {'h','e','l','l','o'};
        reverseString(charArr);
    }
    public static void reverseString(char[] s) {
        int len = s.length;
//        char newChar[] = new char[len];
//        int j=0;
        for (int i = len - 1; i >=0 ; i--) {
            System.out.print(s[i]);
//            newChar[j]=s[i];
//            j++;
        }
//        System.out.println(Arrays.toString(newChar));
    }
}
