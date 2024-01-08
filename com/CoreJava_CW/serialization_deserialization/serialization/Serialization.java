package com.CoreJava_CW.serialization_deserialization.serialization;

import com.CoreJava_CW.serialization_deserialization.Book;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {

        Book b = new Book();
        b.setB_id(101);
        b.setB_name("Gita");
        b.setB_author("Veda Vyasa");

        String path = "C:\\Users\\dipan\\Desktop\\s_d.txt";
        File file = new File(path);//Representing file

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(b);

            oos.flush();
            oos.close();
            fos.flush();
            fos.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("Done...");

    }
}
