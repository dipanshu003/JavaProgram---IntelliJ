package com.CoreJava_CW.constructor.employee;

public class EmployeeClass {
    String name;
    double sal;
    String post;

    public EmployeeClass()
    {
        System.out.println("It is a Default Constructor...");
    }

    public EmployeeClass(String Ename,String Epost,double Esal)
    {
        name = Ename;
        post = Epost;
        sal = Esal;
        showInfo();
    }

    public void showInfo()
    {
        System.out.println("Your name is : "+name);
        System.out.println("Your post is : "+post);
        System.out.println("Your salary is : "+sal);
        System.out.println();

    }


}