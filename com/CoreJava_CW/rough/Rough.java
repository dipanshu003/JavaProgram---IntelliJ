package com.CoreJava_CW.rough;

public class Rough {

    static void m1()
    {
        System.out.println("This rough m1");
    }
    void k1()
    {
        System.out.println("k1() rough class");
    }
}
class Real extends Rough{

    static void m1()
    {
        System.out.println("This real m1");
    }

    void m1(int t)
    {
        System.out.println("This is real overload m1");
    }

    public static void main(String[] args) {
        Real r = new Real();
        r.m1(2);

    }

}


