package com.MockTest;

public class Test {
    public static int max(int a,int b,int c)
    {
        if (a>b && a>c)
        {
            return a;
        } else if (b>a && b>c) {
            return b;
        }
        return c;
    }
}
class Main2
{
    public static void main(String[] args) {
        int a= Test.max(4,2,6);
        System.out.println(a);
    }
}
