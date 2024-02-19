package com.CoreJava_CW.comparable_comparator.Comparator.onObjects;

public class Student {
    private int s_age;
    private  String s_name;

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public Student(int s_age, String s_name) {
        this.s_age = s_age;
        this.s_name = s_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_age=" + s_age +
                ", s_name='" + s_name + '\'' +
                '}';
    }
}
