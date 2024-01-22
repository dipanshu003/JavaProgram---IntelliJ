package com.Hakathon_Practice;

public class Prime_Number_Check {
    public static void main(String[] args) {
        System.out.println(checkPrime(4));
    }
    public static boolean checkPrime(int num)
    {
        int count=0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0)
            {
                count ++;
            }
        }

        if (count==2)
        {
            return true;
        }
        return false;
    }
}
