package com.CoreJava_CW.Stream_API;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int s_id;
    private String s_name;
    private boolean isPresent;

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

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Student ()
    {}
    public Student (int s_id,String s_name,boolean isPresent)
    {
        this.s_id = s_id;
        this.s_name = s_name;
        this.isPresent = isPresent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", isPresent=" + isPresent +
                '}';
    }
}
