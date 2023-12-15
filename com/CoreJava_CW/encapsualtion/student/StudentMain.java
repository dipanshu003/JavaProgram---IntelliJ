package com.CoreJava_CW.encapsualtion.student;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(21);
        s.setId(102);
        s.setName("Dipanshu");
        s.setPer(87);
        s.setStd(10);
        System.out.println(s.display());
    }
}
