package com.CoreJava_CW.encapsualtion.student;

public class Student {
    private String name;
    private int id,age,std;
    private  float per;


    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public String display()
    {
        return "Employee {"+getName()+", "+getAge()+", "+getPer()+", "+getId()+", "+getStd()+"}";
    }
}
