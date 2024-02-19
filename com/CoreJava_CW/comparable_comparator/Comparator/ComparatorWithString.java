package com.CoreJava_CW.comparable_comparator.Comparator;

import java.util.*;

public class ComparatorWithString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length())
                {
                    return 1;
                }
                return -1;
            }
        };

        list.add("Dipanshu");
        list.add("Piyush");
        list.add("Rudra");
        list.add("Vedu");
        list.add("Manoj");


        System.out.println("Before Sorting : "+list);

        Collections.sort(list,com);

        System.out.println("Customize Sorting : "+list);


    }
}
