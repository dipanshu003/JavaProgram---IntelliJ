package com.CoreJava_CW.serialization_deserialization.serialization.serialization_pr1;

import com.CoreJava_CW.comparable_comparator.Comparable.Student;

import java.io.*;

public class Serialization_Pr1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(1,"Kia Sonet",12.5);

        String path = "C:\\Users\\dipan\\Desktop\\Vehicle_sr.txt";
        File file = new File(path);

        if (!file.exists())
        {
            try {
                file.createNewFile();
                System.out.println("File Created...");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        else {
            System.out.println("File Already Created...");
        }

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(v);
            System.out.println("Serialization Completed....");

            oos.flush();
            oos.close();
            fos.flush();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
