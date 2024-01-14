package com.CoreJava_CW.thread;

public class MainThreadDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());//main thread
        Thread.currentThread().setName("Dip main");
        System.out.println(Thread.currentThread().getName());//Dip main thread

        System.out.println(10/0);//Through Exception
    }
}
