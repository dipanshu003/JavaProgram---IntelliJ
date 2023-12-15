package com.CoreJava_CW.polymorphism.overriding;

abstract class A{
    static String name;

    void setName(String name)
    {
    }

    abstract String getName();
     void display()
    {
        System.out.println("display() Name -> "+name);
    }
}

class B extends A{
    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String name) {
        super.name =name;
    }

}

class Main1
{
    public static void main(String[] args) {
        A a = new B();
        a.setName("Dipanshu");
        a.display();
        System.out.println("getName() Name-> "+a.getName());
    }
}
