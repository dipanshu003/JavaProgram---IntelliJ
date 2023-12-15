package com.CoreJava_CW.abstraction.example4_student;

public abstract  class Student {
    private String name;
    int id,std;

    Student(String name,int id, int std)
    {
        this.name  = name;
        this.id = id;
        this.std = std;
    }
    abstract void totalMarks();
    abstract void percentage();

    void disp()
    {
        System.out.println("Name - > "+name);
        System.out.println("id - > "+id);
        System.out.println("Standard - > "+std);

    }
}
