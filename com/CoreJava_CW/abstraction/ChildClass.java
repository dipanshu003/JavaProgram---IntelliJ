package com.CoreJava_CW.abstraction;

public class ChildClass extends Abstraction{

    ChildClass(String name)
    {
        super(name);
    }
    @Override
    public void showName() {
        System.out.println("This is "+name);
    }

    public static void main(String[] args) {
        ChildClass c = new ChildClass("Dipanh");
        c.showName();
    }
}
