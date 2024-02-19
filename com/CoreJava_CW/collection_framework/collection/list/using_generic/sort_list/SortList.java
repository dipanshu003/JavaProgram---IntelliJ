package com.CoreJava_CW.collection_framework.collection.list.using_generic.sort_list;

import java.util.List;

public class SortList {
    public static void main(String[] args) {

        Student s= new Student();
        Student s1 = new Student(101,"Dipanshu",21);
        Student s2 = new Student(102,"Manoj",43);
        Student s3 = new Student(103,"Piyush",17);

        s.addObj(s1);
        s.addObj(s2);
        s.addObj(s3);

        System.out.println(s.list);
        SortList.sortListByAge(s.list);

        System.out.println("-------------------------------------------");

        System.out.println(s.list);

    }

    public static void sortListByAge(List<Student> list)
    {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j-1).getAge()>list.get(j).getAge())
                {
                    Student temp= list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
