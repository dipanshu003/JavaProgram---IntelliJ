package com.CoreJava_CW.string;

import java.util.*;

public class RemoveDuplicateCh_inStr {
    public static void main(String[] args) {
        String str = "programmingp";
        removeDuplicate3(str);

//        System.out.println(str.indexOf('g',5));
    }

    public static void removeDuplicate1(String string)
    {
        //Using Set Interface
        char[] charArr = string.toCharArray();
        Set set = new HashSet();
        for (int i = 0; i <charArr.length ; i++) {
            set.add(charArr[i]);
        }

        System.out.println(set);
    }
    public static void removeDuplicate2(String string)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            int n = string.indexOf(ch,i+1);

            if (n==-1)
            {
                sb.append(ch);
            }

        }
        System.out.println(sb);
    }

    public static void removeDuplicate3(String string)
    {
        char charArr[] = string.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            boolean repeated = false;
            for (int j = i+1; j < charArr.length ; j++) {
                if (charArr[i]==charArr[j])
                {
                    repeated = true;
                    break;
                }
            }

            if (!repeated)
            {
                sb.append(charArr[i]);
            }
        }
        System.out.println(sb);
    }
}
