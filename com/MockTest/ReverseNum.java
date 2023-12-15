package com.MockTest;

public class ReverseNum {
    public static void main(String[] args) {

        int num = 123;
        int n = 0;
        int rev = 0;

        while (num>0)
        {
            n = num % 10;
            num = num/10;
            rev = (rev*10)+n;
        }
        System.out.println(rev);
    }
}
