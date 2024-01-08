package practice.Interview_Practice.pr1.sorting_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SortingList {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        Book b1 = new Book(102,"Gita",822);
        Book b2 = new Book(103,"Ramayan",500);
        Book b3 = new Book(101,"Hindi Sahitya",370);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        sortList(list);

        ListIterator li = list.listIterator();

        while (li.hasNext())
        {
            System.out.println(li.next());
        }

//        System.out.println(list);


    }

    private static void sortList(List<Book> list)
    {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i).getB_id() > list.get(j).getB_id())
                {
                     Book temp  = list.get(i);
                     list.set(i,list.get(j));
                     list.set(j,temp);
                }
            }
        }
    }
}
