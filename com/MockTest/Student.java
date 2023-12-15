package com.MockTest;

import java.util.Scanner;

public class Student {
//
//    Design a Java program for a student information system. Create a class
//named Student with attributes like name, roll number, and grade. Implement a constructor
//    to initialize these attributes.
//    Allow the user to input the student's information and display it.

    String name;
    int roll_no;
    String grade;


    Student(String Sname,int Sroll_no,String Sgrade)
    {
        name = Sname;
        roll_no = Sroll_no;
        grade = Sgrade;
        disp();
    }

    public void disp()
    {
        System.out.println("Student name ->"+name);
        System.out.println("Student roll no. ->"+roll_no);
        System.out.println("Student grade ->"+grade);

    }

}

class Main{
    public static void main(String[] args) {



    }
}
