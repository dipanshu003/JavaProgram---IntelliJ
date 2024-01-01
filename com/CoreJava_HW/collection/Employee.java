package com.CoreJava_HW.collection;

public class Employee {
    String name;
    float salary;

    public Employee (String name,float salary)
    {
        this.name = name;
        this.salary  = salary;
    }

    @Override
    public String toString() {
        return this.name +" -> "+this.salary;
    }
}
