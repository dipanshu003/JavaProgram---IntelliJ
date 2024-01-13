package com.CoreJava_CW.thread.different_cases_toexecuteThread;

public class SingleTask_MultileThread extends  Thread {
    @Override
    public void run() {
        System.out.println("This is Task ..");
    }

    public static void main(String[] args) {//main thread (first thread)
        SingleTask_MultileThread t1 = new SingleTask_MultileThread();//second thread
        t1.start();
        SingleTask_MultileThread t2 = new SingleTask_MultileThread();//third  thread
        t2.start();

    }
}
