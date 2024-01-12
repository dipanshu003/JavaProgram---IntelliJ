package com.MockTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);

        System.out.println(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
//        Collections.reverse(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(list);

//        System.out.println("Before Sorting : "+list);
//        sortList(list);
//        System.out.println("After Sorting : "+list);

    }

//    public static void sortList (List<Integer> list)
//    {
//        for (int i = 0; i <list.size() ; i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                if (list.get(i)>list.get(j))
//                {
//                    int temp = list.get(i);
//                    list.set(i,j);
//                    list.set(j,temp);
//                }
//            }
//        }
//    }
}
