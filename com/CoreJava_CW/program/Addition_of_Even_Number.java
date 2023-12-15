package com.CoreJava_CW.program;

public class Addition_of_Even_Number {
    public static void main(String[] args) {

        int evenSum=0;
        for (int i = 10; i <=20 ; i++) {
            if (i%2==0)
            {
                evenSum = evenSum+i;
            }
        }
        System.out.println("Your Even Number Sum is : "+evenSum);

        int oddSum=0;
        for (int i = 20; i <=30 ; i++) {
            if (i%2==1)
            {
                oddSum = oddSum+i;
            }
        }
        System.out.println("Your Odd Number Sum is : "+oddSum);
    }
}
