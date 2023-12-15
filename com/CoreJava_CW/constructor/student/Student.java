package com.CoreJava_CW.constructor.student;

public class Student {
    String name;
    int id,std,sub1,sub2,sub3,total;
    float per;

    public Student(String name,int id,int std,int sub1,int sub2,int sub3)
    {
        this.id=id;
        this.std = std;
        this.name = name;
        this.sub1 =sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        total();
        percentage();
    }

    public int total()
    {
        total = sub1+sub2+sub3;
        return total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", std=" + std +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 +
                ", total=" + total +
                ", per=" + per +
                '}';
    }

    public float percentage()
    {
        per = total/3;;
        return per;
    }


}
