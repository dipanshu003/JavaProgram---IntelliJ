package com.CoreJava_HW.program;

public class Bingo {
    public static void main(String[] args) {
        Bingo b = new Bingo();
        System.out.println(b.bingoOr(49));
    }
    public boolean bingoOr(int num)
    {
        int n = 0;
        int temp = num;

        while (temp >0)
        {
            n=temp%10;
            temp = temp/10;

            if (n==7)
            {
                return false;
            }
        }

        if (num%7!=0)
        {
            return false;
        }

        return true;

    }
}
