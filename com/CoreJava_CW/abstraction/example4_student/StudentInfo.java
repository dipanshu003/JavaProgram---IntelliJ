package com.CoreJava_CW.abstraction.example4_student;

public class StudentInfo extends Student{

    StudentInfo(String name, int id, int std) {
        super(name, id, std);
    }

    @Override
    void totalMarks() {
        System.out.println("It is total marks");
    }

    @Override
    void percentage() {
        System.out.println("It is percentage");
    }
}
