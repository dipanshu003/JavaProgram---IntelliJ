package practice.InterviewPre_String_Question;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "Deepanshu";
        removeDuplicate2(str);
    }

    public static void removeDuplicate1(String string)
    {
        char[] charArr = string.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < charArr.length; i++) {
            set.add(charArr[i]);
        }

        System.out.println(set);
    }

    public static void removeDuplicate2(String str)
    {
        char[] chArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chArr.length; i++) {
            boolean repeating = false;
            for (int j = i+1; j < chArr.length; j++) {
                if (chArr[i] == chArr[j])
                {
                    repeating = true;
                    break;
                }
            }
            if (!repeating)
            {
                sb.append(chArr[i]);
            }
        }

        System.out.println("This is new ->"+sb);
    }
}
