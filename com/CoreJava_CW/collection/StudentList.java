package com.CoreJava_CW.collection;

import java.util.*;

public class StudentList {

    public static void main(String[] args) {

        List list1 = new ArrayList();

        list1.add(new Student("Dip",101,21));


        List list2 = new LinkedList();
        list2.add(new Student("Piyu",102,17));
        list2.addAll(list1);

//        System.out.println(list2);

//        1.Iterate by foreach loop
//        for (Object o : list2)
//        {
//            System.out.println(o);
//        }

        System.out.println("It is List Iterator");
//        2.By ListIterator
        ListIterator li = list2.listIterator();

        while (li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println();
         while (li.hasPrevious())
         {
             System.out.println(li.previous());
         }

        System.out.println();
        System.out.println("It is Iterator");

//        3.By Iterator
        Iterator it = list2.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
