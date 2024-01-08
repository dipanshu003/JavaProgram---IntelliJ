package practice.InterviewPre_String_Question;

public class ReverseString_StringBuffer {
    public static void main(String[] args) {
        String str = "Dipa";
        reverseStringSB(str);
    }

    public static void reverseStringSB(String str)
    {
        StringBuffer sb = new StringBuffer();

        char[] chArr=str.toCharArray();

        for (int i = chArr.length-1; i >=0 ; i--) {
            char ch=chArr[i];
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
