package com.CoreJava_CW.collection_framework.map;

import java.util.*;

public class IteratingMap {
    public static void main(String[] args) {

        Map map = new HashMap<>();

        map.put(1,"Dip");
        map.put("P","Piyush");
        map.put(true,234.23);

        Collection c =map.entrySet();

        for (Object o : c)
        {
            System.out.println((o));
        }
    }
}
