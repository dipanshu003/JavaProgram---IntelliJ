package com.CoreJava_CW.collection_framework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map  map = new HashMap();
        map.put(101,"Dipanshu");
        map.put(102,null);
        map.put(103,null);
        map.put(null,null);

        Collection collection =map.entrySet();
        System.out.println(collection);

        System.out.println(map.get(101));
        System.out.println(map.containsKey(104));

        System.out.println(map.equals(map));
        System.out.println(map.containsValue(null));

//        Iterator it = map.values().iterator();
//
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }

    }
}
