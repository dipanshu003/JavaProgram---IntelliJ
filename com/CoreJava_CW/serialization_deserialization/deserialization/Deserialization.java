package com.CoreJava_CW.serialization_deserialization.deserialization;

import com.CoreJava_CW.serialization_deserialization.Book;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\dipan\\Desktop\\s_d.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Book b=(Book)ois.readObject();
            System.out.println(b);
            ois.close();
            fis.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
