package com.Hakathon_Practice;

public class Sum_of_Digit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1234));
    }
    public static int sumOfDigit(int num)
    {
        int sum=0;
        while (num>0)
        {
            int n = num % 10;
            sum += n;
            num = num/10;
        }
        return sum;
    }
}
