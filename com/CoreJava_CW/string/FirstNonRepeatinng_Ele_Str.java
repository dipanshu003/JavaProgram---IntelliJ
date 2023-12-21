package com.CoreJava_CW.string;

public class FirstNonRepeatinng_Ele_Str {
    public static void main(String[] args) {
        String str = "abacadd";
        firtNonRepeating(str);
    }
    public static void firtNonRepeating(String string)
    {
        char chrArr[]=string.toCharArray();
        for (int i = 0; i <chrArr.length ; i++) {
            boolean isRepeating = false;
            for (int j = i+1; j < chrArr.length; j++) {
                if (chrArr[i]==chrArr[j])
                {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating)
            {
                System.out.print(chrArr[i]);
                break;
            }

        }
    }
}
