package com.CoreJava_CW.comparable_comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Comparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();

        Student s1 = new Student(101,"Dipanshu Dhole ","ddofficial@gmail.com");
        Student s2 = new Student(102,"Piyush Dhole ","pdofficial@gmail.com");
        Student s3 = new Student(103,"Manthan Dhole ","mdofficial@gmail.com");

        list.add(s1);
        list.add(s2);
        list.add(s3);
//        System.out.println(list);

//        List<Student> list1=list.stream().filter(n->n.getS_id()==101).collect(Collectors.toList());
//        System.out.println(list1);

        Collections.sort(list);
        System.out.println(list);
    }
}
