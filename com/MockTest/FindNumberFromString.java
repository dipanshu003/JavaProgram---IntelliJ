package com.MockTest;

public class FindNumberFromString {
    public static void main(String[] args) {
        String str = "Dip1anshu2";
        findNumberString2(str);
    }

    public static void findNumberString1(String string)
    {
        String comStr = "123456789";

        for (int i = 0; i <comStr.length() ; i++) {
            for (int j = 0; j < string.length(); j++) {
                if (comStr.charAt(i) == string.charAt(j))
                {
                    System.out.println(string.charAt(j));
                }
            }
        }
    }

    public static void findNumberString2(String string)
    {
        char[] charArr = string.toCharArray();

        for (char ch : charArr)
        {
            if (Character.isDigit(ch))
            {
                System.out.print(ch+" ");
            }
        }
    }
}
