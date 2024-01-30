package com.CoreJava_CW.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class    StreamObject{
    public static void main(String[] args) {
        Stream<Object> isEmpty=Stream.empty();

        //we can perform stream in Arrays also
//        String[] names= {"Dipanshu","Piyush","Manoj"};
//        Stream<String> nameStream=Stream.of(names);
//        nameStream.forEach(n-> System.out.println(n));

        List<Integer> list = new ArrayList<>();
        list.add(113);
        list.add(13);
        list.add(123);

        Stream<Integer> stream= list.stream();

        List<Integer> newList=stream.filter(i -> i>50).collect(Collectors.toList());
        System.out.println(newList);

    }
}
