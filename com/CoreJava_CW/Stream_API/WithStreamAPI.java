package com.CoreJava_CW.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStreamAPI {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Dipanshu Dhole",true);
        Student s2 = new Student(102,"Piyush Dhole",false);
        Student s3 = new Student(103,"Manisha Dhole",true);
        List<Student> list  = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //using Stream API
//        Stream<Student> stream =list.stream();
//        List<Student> newList1=stream.filter(n->n.getS_id()>102).collect(Collectors.toList());

        List<Student> newList2=list.stream().filter(i->i.isPresent()==true).collect(Collectors.toList());

        System.out.println(newList2);
    }
}
