package com.CoreJava_CW.thread;

public class Test extends Thread
{
    @Override
    public void run() {
        System.out.println("This is Task...");
        System.out.println(isAlive());
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        System.out.println(t.isAlive());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(t.getName());
    }
}
