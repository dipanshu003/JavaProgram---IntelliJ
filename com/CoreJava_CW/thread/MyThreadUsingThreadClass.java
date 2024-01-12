package com.CoreJava_CW.thread;

public class MyThreadUsingThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("This is my thread...");
    }

    public static void main(String[] args) {
        MyThreadUsingThreadClass t = new MyThreadUsingThreadClass();
        t.start();
    }
}
