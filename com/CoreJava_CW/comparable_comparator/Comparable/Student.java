package com.CoreJava_CW.comparable_comparator.Comparable;
import org.jetbrains.annotations.NotNull;

import java.lang.Comparable;

public class Student implements Comparable<Student> {
    private int s_id;
    private String s_name;
    private String s_email;

    public Student(int s_id,String s_name,String s_email)
    {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_email = s_email;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_email='" + s_email + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.s_id = o.s_id;
    }
}
