package com.MockTest.functional_interface;

public interface A {
    void sum(int a,int b);

    public static void main(String[] args) {
        A a = (a1,b1) -> System.out.println(a1+b1);
        a.sum(10,3);
    }
}
