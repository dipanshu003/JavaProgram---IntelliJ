package com.CoreJava_CW.thread.different_cases_toexecuteThread.MultipleTask_MultipleThread;

public class Main {
    //Create the Object of Both MyThread1 And MyThread2 Class
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }

}
