package com.Hakathon_Practice;

public class Factorial_Calculation {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num)
    {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
