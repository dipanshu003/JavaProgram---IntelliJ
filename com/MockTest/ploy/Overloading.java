package com.MockTest.ploy;

import com.MockTest.Polymorphism;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class Overloading {
    public void m1() {
        System.out.println("This is m1()");
    }
    public void m1(String name) {
        m1();
        System.out.println("This is m1(String str)");
    }
    public void m1(String name, int age){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.m1("Dip");
    }
}
