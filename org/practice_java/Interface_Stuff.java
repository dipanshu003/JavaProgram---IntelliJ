package org.practice_java;


class Main implements Interface_Class {
    public static void main(String[] args) {
        Interface_Class i =new Main();

        i.run();
        i.setGetName();
        i.showName();
        System.out.println(Interface_Class.sum());
    }

    @Override
    public void run() {
        System.out.println(" Is running....");
    }

    @Override
    public void setGetName() {
        System.out.println("Getting Setting...");
    }

}
interface Interface_Class
{
    String name = "Mohan";
    int a=3;
    int b=4;
    void run();
     void setGetName();
     default void showName()
     {
         System.out.println(name + "is this name");
     }

     static int sum ()
     {
         return a+b;
     }

}