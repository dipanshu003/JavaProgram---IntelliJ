package com.CoreJava_CW.thread;

public class ManualThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());//Thread-0
        Thread.currentThread().setName("Dip thread");
        System.out.println(Thread.currentThread().getName());//Dip thread
        System.out.println("This is thread...");
    }

    public static void main(String[] args) {
        ManualThreadDemo t = new ManualThreadDemo();
        t.start();
        System.out.println(Thread.currentThread().getName());//main thread
        System.out.println(t.isAlive());
    }
}
