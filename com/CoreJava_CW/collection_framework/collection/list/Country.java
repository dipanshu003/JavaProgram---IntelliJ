package com.CoreJava_CW.collection_framework.collection.list;

import java.util.LinkedList;
import java.util.List;

public class Country {
    String c_name,c_area;
    long c_popu;


    Country(String c_name,String c_area,long c_popu)
    {
        this.c_area = c_area;
        this.c_name = c_name;
        this.c_popu = c_popu;
    }

    @Override
    public String toString() {
        return "Country{" +
                "c_name='" + c_name + '\'' +
                ", c_area='" + c_area + '\'' +
                ", c_popu=" + c_popu +
                '}';
    }

    public static void main(String[] args) {
        List list = new LinkedList();
        Country c1= new Country("India","Norther region",9357);
        Country c2= new Country("Australia","Norther region",9357);
        Country c3= new Country("South Africa","South region",9357);
        Country c4= new Country("Ireland","Western region",9357);

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);




//        list.add(new Country("India","Norther region",9357));
//        list.add(new Country("South Africa","South region",983745));
//        list.add(new Country("Australia","Middle East region",783400));
//        list.add(new Country("Ireland","Norther region",6379357));

//        System.out.println(list);

//        System.out.println(list.removeAll(list));
//        System.out.println(list.contains(c1));
//        System.out.println(list.get(3));
//        System.out.println(list.indexOf(c3));
//        System.out.println(list.hashCode());
//        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf(c2));
        System.out.println(list.getClass() );
        System.out.println();
//        System.out.println(list.equals(list));
//        System.out.println(list.get(0));
//        System.out.println(list.containsAll(list));
//        System.out.println(list.indexOf("India"));
//        list.clear();
//        System.out.println(list);
    }

}
