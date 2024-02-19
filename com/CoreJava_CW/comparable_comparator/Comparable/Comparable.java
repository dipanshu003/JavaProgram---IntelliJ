package com.CoreJava_CW.comparable_comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(54,"Rajkumar Dhole"));
        list.add(new Student(41,"Manisha Dhole"));
        list.add(new Student(17,"Piyush Dhole"));
        list.add(new Student(21,"Dipanshu Dhole"));

        Collections.sort(list);
        System.out.println(list);

    }

}
