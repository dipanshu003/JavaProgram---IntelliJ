package com.CoreJava_CW.comparable_comparator.Comparable;
import org.jetbrains.annotations.NotNull;

import java.lang.Comparable;

public class Student implements Comparable<Student>
{
    private int s_age;
    private String s_name;

    @Override
    public String toString() {
        return "Student{" +
                "s_age=" + s_age +
                ", s_name='" + s_name + '\'' +
                '}';
    }

    public Student(int s_age, String s_name) {
        this.s_age = s_age;
        this.s_name = s_name;
    }

    @Override
    public int compareTo(Student that) {
        if (this.s_age>that.s_age)
        {
            return 1;
        }
        return -1;
    }
}
