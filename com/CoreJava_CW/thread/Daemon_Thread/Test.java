package com.CoreJava_CW.thread.Daemon_Thread;

public class Test extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
//        Thread.currentThread().setDaemon(true);//Throw Exception IllegalThreadStateException
        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().isDaemon());//Not execute further program
        Test t = new Test();
        t.setDaemon(true);
        t.start();
//        t.setDaemon(true);//Throw Exception IllegalThreadStateException
    }
}
