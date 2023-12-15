package org.practice_java.arrays_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student sArr[] = new Student[1];
        accept(sArr);
        display(sArr);

    }

    public static void accept(Student[] sArr)
    {
        Scanner x= new Scanner(System.in);
        for (int i = 0; i <sArr.length ; i++) {
            sArr[i] = new Student();

            System.out.println("Enter name : ");
            sArr[i].name = x.next();
            System.out.println("Enter id : ");
            sArr[i].id = x.nextInt();
        }
    }

    public static void display(Student[] sArr)
    {
        for (int i = 0; i <sArr.length ; i++) {
            System.out.println(sArr[i].id);
            System.out.println(sArr[i].name);
        }
    }
}
