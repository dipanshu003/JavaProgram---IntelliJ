package com.CoreJava_CW.collection_framework.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void dis()
    {
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Student("Dip",21));
        list.add(new Student("Piyu",16));
        list.add(new Student("Vikra",50));

    }
}
