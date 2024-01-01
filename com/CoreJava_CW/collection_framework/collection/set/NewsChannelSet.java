package com.CoreJava_CW.collection_framework.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class NewsChannelSet {
    String newsCh;

    public static void main(String[] args) {

        Set set1 = new LinkedHashSet();
        set1.add("ABP news");
        set1.add("India news");
        set1.add("BBC news");

        Set set2 = new LinkedHashSet();
        set2.add("ABP news");
        set2.add("India news");
        set2.add("BBC news");


        System.out.println(set1.size());
        System.out.println(set1.equals(set2));
        System.out.println(set1.isEmpty());
        System.out.println(set1.contains(set2));
        System.out.println(set1);
        System.out.println(set1.remove("ABP news"));
        System.out.println(set1);
        set1.addAll(set2);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);



//        Iterator it = set.iterator();
//
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }


    }
}
