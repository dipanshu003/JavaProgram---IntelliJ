package com.CoreJava_CW.thread;

public class MyThreadUsingRunnableInterface implements  Runnable {
    @Override
    public void run() {
        System.out.println("This is my Thread...");
    }

    public static void main(String[] args) {
        MyThreadUsingRunnableInterface t= new MyThreadUsingRunnableInterface();
        Thread thread = new Thread(t);
        thread.start();
    }
}
