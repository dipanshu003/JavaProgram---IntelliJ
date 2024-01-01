package com.CoreJava_HW.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee("Dipanshu", 35000);
        Employee e2 = new Employee("Piyush", 25000);
        Employee e3 = new Employee("Rudra", 45000);
        Employee e4 = new Employee("Manoj", 75000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        sortList(list);

        ListIterator li = list.listIterator();

        while (li.hasNext())
        {
            System.out.println(li.next());
        }

    }

    public static void sortList(List<Employee> list)
    {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if (list.get(i).salary > list.get(j).salary)
                {
                    Employee temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
