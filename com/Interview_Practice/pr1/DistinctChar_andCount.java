package com.Interview_Practice.pr1;

public class DistinctChar_andCount {
    public static void main(String[] args) {
        String str = "dippiyu";
        distinctCount(str);
    }

    public static void distinctCount(String str)
    {
        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(str.charAt(i)+"->"+count);
        }
    }

}
