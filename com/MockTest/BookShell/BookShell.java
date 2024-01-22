package com.MockTest.BookShell;

import java.util.ArrayList;

public class BookShell {
    ArrayList list;

    BookShell() {
        list = new ArrayList<BookShell>();
    }

    public void addBook(String book_name) {
        System.out.println();
        list.add(book_name);
        System.out.println(book_name + " is added successfully");
    }

    public void removeBook(String book_name) {
        System.out.println();
        if (!list.isEmpty()) {
            list.remove(book_name);
            System.out.println(book_name + " removed successfully");
        } else {
            System.out.println("your Shell is Empty");
        }
    }

    public void dispBookList() {
        System.out.println();
        if (!list.isEmpty()) {

            for (Object o : list) {
                System.out.println(o);
            }
        }
        else {
            System.out.println("Your Book List is Empty");
        }

    }

    public static void main(String[] args) {
        BookShell b = new BookShell();
        b.addBook("Gita");
        b.addBook("Ramayan");

        b.dispBookList();
        b.removeBook("Gita");

    }
}
