package com.CoreJava_CW.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WithoutStreamAPI {

    public static void main(String[] args) {
        //Create a list and filter id greater than 102

        Student s1 = new Student(101,"Dipanshu Dhole",true);
        Student s2 = new Student(102,"Piyush Dhole",false);
        Student s3 = new Student(103,"Manisha Dhole",true);

        List<Student> list  = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);


        //without StreamAPI
        for (Student s : list)
        {
            if (s.getS_id()>102)
            {
                System.out.println(s);
            }

        }

    }

}
