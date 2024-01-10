package com.CoreJava_CW.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Comparator {
    public static void main(String[] args) {

        List pen = new ArrayList();

        pen.add(new Pen(5,"Black"));
        pen.add(new Pen(15,"Blue"));
        pen.add(new Pen(20,"Red"));
        pen.add(new Pen(10,"Green"));

        System.out.println(pen);

        Collections.sort(pen);
        System.out.println(pen);

    }
}
