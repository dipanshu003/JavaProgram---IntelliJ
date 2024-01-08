package practice.InterviewPre_String_Question;

import java.util.*;

public class FindCharacterOccurance {
    public static void main(String[] args) {
        String str = "dippiyu";
        findCharOccurance(str);
    }

    public static void findCharOccurance(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j))
                {
                    count++;

                }
            }
            System.out.println(str.charAt(i)+"-> "+count);
        }
    }
}
