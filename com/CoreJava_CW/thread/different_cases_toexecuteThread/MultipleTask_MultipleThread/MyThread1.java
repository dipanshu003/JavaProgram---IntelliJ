package com.CoreJava_CW.thread.different_cases_toexecuteThread.MultipleTask_MultipleThread;

public class MyThread1 extends Thread {
    //If you  want to create multiple task then you need to create multiple classes


    @Override
    public void run() {
        System.out.println("First Task...");
    }
}
