package com.CoreJava_CW.comparable_comparator.Comparator.onObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComTest {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Comparator<Student> com = (Student s1, Student s2) -> (s1.getS_age() < s2.getS_age() ? 1 : -1);

        list.add(new Student(21, "Dip"));
        list.add(new Student(6, "Rudra"));
        list.add(new Student(17, "Piyush"));
        list.add(new Student(4, "Vedu"));


        Collections.sort(list, com);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
