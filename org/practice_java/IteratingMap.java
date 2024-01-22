package org.practice_java;

import java.util.*;
import java.util.stream.Stream;

public class IteratingMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Dipanshu");
        map.put(2,"Ram");
        Set set=map.entrySet();

        Stream stream =set.stream();
        stream.forEach(n-> System.out.println(n));

    }
}
