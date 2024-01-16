package com.CoreJava_CW.thread.Thread_Priorities;

public class Test extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Test t = new Test();
        t.setPriority(8);
        t.start();
        Test t2 = new Test();
        t2.setPriority(7);
        t2.start();

    }
}
