package com.CoreJava_CW.collection_framework.collection.collection_generic;

import java.util.ArrayList;

public class Country {
    String name,location,area;
    long popu;
    static ArrayList<Country> list = new ArrayList();

    public Country(String name, String location, long popu, String area) {
        this.name = name;
        this.location = location;
        this.popu = popu;
        this.area = area;
        show(list);
    }

    public static void show(ArrayList<Country> list)
    {
        for (Country c : list)
        {
            System.out.println(c);
        }
    }

    public void addList()
    {
        list.add(this);
    }

    @Override
    public String toString() {
        return "Name : "+name+"Location : "+location+"Population : "+"Area : "+area;
    }
}
