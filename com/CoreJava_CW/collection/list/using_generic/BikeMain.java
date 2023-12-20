package com.CoreJava_CW.collection.list.using_generic;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class BikeMain {
    public static void main(String[] args) {

        List<Bike> list = new ArrayList();

        list.add(new Bike("R15",82638));
        list.add(new Bike("PassionPro",7090));
        list.add(new Bike("Splender",9632));


       sortList(list);
       ListIterator li = list.listIterator();

       while (li.hasNext())
       {
           System.out.println(li.next());
       }

    }

    public static void sortList(List<Bike> list)
    {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                if (list.get(i).price>list.get(j).price)
                {
                    Bike temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
