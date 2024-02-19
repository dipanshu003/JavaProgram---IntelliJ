package com.MockTest;

public class RootOfNum {
    public static void main(String[] args) {
        int num = 25;
        rootOfNum(num);
    }

    public static void rootOfNum(int num)
    {
        int i = 1;
        while (true)
        {
            if (i*i==num)
            {
                System.out.println(i);
                break;
            }
            i++;
        }

    }

}
