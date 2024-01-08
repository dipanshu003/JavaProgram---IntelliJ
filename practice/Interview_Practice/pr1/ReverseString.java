package practice.Interview_Practice.pr1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Dip";
        reverseString(str);
    }

    public static void reverseString(String str)
    {
        StringBuffer sb = new StringBuffer();

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
