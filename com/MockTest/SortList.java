package com.MockTest;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);

        sort(list);

        System.out.println(list);

    }

    public static void sort(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if (list.get(i)>list.get(j))
                {
                    int temp = list.get(i);
                    list.set(i,j);
                    list.set(j,temp);
                }
            }
        }
    }
}
