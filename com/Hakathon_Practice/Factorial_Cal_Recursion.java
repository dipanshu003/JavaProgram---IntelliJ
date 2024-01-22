package com.Hakathon_Practice;

public class Factorial_Cal_Recursion {
    public static void main(String[] args) {
        factoRecursion(1,1,5);
    }

    public static void factoRecursion(int fact,int i,int num)
    {

        if (i>num)
        {
            System.out.println(fact);
            return;

        }
        fact = fact*i;
        factoRecursion(fact,i+1,num);
    }
}
