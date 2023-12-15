package com.CoreJava_CW.exception.user_defined;

public class Student {
    float math,sci,hindi;
    Student(float math,float sci,float hindi)
    {
        this.math = math;
        this.sci = sci;
        this.hindi = hindi;
    }

    public void  totalANDpercentage()
    {
        float total = math+sci+hindi;

        float per = total/3;
        if (per<35)
        {
            System.out.println("Percentage  - > "+per);
            throw  new FailedException("You are Fialed....");
        }
        else {
            System.out.println("Percentage  - > "+per);
            System.out.println("You are Pass...");

        }


    }

    public static void main(String[] args) {
        Student s = new Student(5,64,12);
        s.totalANDpercentage();
    }
}
