package org.practice_java;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionClass {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al1 = new ArrayList();
        al.add("Ram");
        al.add(10);
        al.add('R');
        al.add(23.234);
        al.add(true);
        System.out.println(al);

//        Car car1 = new Car("Sonet", 49594, 1200000);
//        Car car2 = new Car("Thar", 93849, 2200000);
//        Car car3 = new Car("Fortuner", 93884, 3000000);
//        Car car4 = new Car("Audi Q8", 59083, 12000000);
//        al1.add(car1);
//        al1.add(car2);
//        al1.add(car3);
//        al1.add(car4);
//
//        System.out.println(al1);


        //**Iterator use

//        Iterator i = al.iterator();
//        while (i.hasNext())
//        {
//            System.out.println(i.next());
//        }



        //ListIterator use
        ListIterator il = al.listIterator();
        while(il.hasNext())
        {
            System.out.println(il.next());
        }

        System.out.println("________________________");


        ListIterator il1 = al.listIterator();
        while(il.hasPrevious())
        {
            System.out.println(il.previous());
        }

    }
}

class Palindrome {
    public static void main(String[] args) {

        int num= 1254;
        isPalindrome(num);

    }
    static void isPalindrome(int num)
    {
        String newNum = "";
        String strNum = String.valueOf(num);
        for (int i = strNum.length()-1; i >=0 ; i--) {
            char ch = strNum.charAt(i);
            newNum = newNum+ch;
        }

        if (newNum.equals(strNum))
        {
            System.out.println("panlindrome..");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
