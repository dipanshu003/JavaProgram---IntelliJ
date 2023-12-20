package com.CoreJava_CW.collection.list.using_generic;

import java.util.LinkedList;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {

        List<Book> list = new LinkedList<>();


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            Book b = new Book();
            list.add(b);
        }

        sortList(list);

        for (Book b : list) {
            System.out.println(b);
        }
    }

    public static void sortList (List<Book> list)
    {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).total_price>list.get(j).total_price)
                {
                    Book temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
