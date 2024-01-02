package com.Interview_Practice.pr1;

import java.util.Arrays;

public class DigitIntoWord {
    public static void main(String[] args) {
        int num = 240;
        digitToWord2(num);
    }

    public static String digitIntoWord(int num) {
        switch (num) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";

            case 3:
                return "Three";

            case 4:
                return "Four";

            case 5:
                return "Five";

            case 6:
                return "Six";

            case 7:
                return "Seven";

            case 8:
                return "Eight";

            case 9:
                return "Nine";


            default:
                System.out.println("Invalid Number Enter ...");
        }
        return null;
    }

    public static void digitToWord2(int num) {
        String words = "";
        while (num > 0) {
            int n = num % 10;
            String word = digitIntoWord(n);
            words = words + word+" ";
            num = num / 10;
        }
        String[] newWords = words.split(" ");
        for (int i = newWords.length-1; i >=0 ; i--) {
            System.out.print(newWords[i]+" ");
        }
//        System.out.println(Arrays.toString(newWords));
    }
}
