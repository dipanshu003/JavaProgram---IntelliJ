package com.CoreJava_CW.collection_framework.collection.list.using_generic.sort_list;

import java.util.ArrayList;

public class Student{
    private int id;
    private String name;
    private int age;

    ArrayList <Student> list;

    //constructor


    public Student ()
    {
        list = new ArrayList<>();

    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void addObj(Student s)
    {
        list.add(s);
    }

    //    gettters and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
