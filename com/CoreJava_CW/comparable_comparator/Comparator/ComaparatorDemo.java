package com.CoreJava_CW.comparable_comparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComaparatorDemo {
    public static void main(String[] args) {

        List<Integer> list  = new ArrayList<>();

        //To apply Customize sorting we need Comparator object
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10>o2%10)
                {
                    return 1;
                }
                return -1;
            }
        };

        list.add(32);
        list.add(71);
        list.add(17);
        list.add(36);

        System.out.println("Before Sorting : "+list);

        Collections.sort(list);

        System.out.println("After Sorting : "+list);

        Collections.sort(list,com);

        System.out.println("Customize Sorting : "+list);





    }
}
