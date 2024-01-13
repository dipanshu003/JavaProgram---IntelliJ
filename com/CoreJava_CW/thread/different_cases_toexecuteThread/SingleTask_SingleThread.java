package com.CoreJava_CW.thread.different_cases_toexecuteThread;

public class SingleTask_SingleThread extends  Thread{
    @Override
    public void run() {
        System.out.println("The is Sum from run () : "+ (2+2));//task
    }

    public static void main(String[] args) {//main thread (created by JVM) first thread
        SingleTask_SingleThread t1 = new SingleTask_SingleThread();//Second thread
        t1.start();

    }


}
