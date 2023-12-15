package com.CoreJava_CW.polymorphism.overloading;

import java.util.Arrays;

public class Employee {

    static  int[] arr = {342,12,3,4};
    public final void disp()
    {
        System.out.println("This is Empty Display Method...");
    }
    public final void disp(int id)
    {
        System.out.println("Employee id : "+id);
    }
    public void disp(int id,String name)
    {
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);

    }
    public void disp(String name,int id)
    {
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);

    }

    public void disp(int id,String name,String comp)
    {
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee Company name : "+comp);

    }

    public static void main(String[] args) {


        Employee e = new Employee();
        e.disp();
        System.out.println();
        e.disp(101);
        System.out.println();
        e.disp(201,"Dipanshu");
        System.out.println();
        e.disp("Piyush",301);
        System.out.println();
        e.disp(501,"Rudra","Apple");
        System.out.println();
        Employee.main(arr);
    }

    public static void main(int[] ar)
    {
        System.out.println(Arrays.toString(ar));
        System.out.println("Integer Array Return");
    }

}
