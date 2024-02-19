package com.CoreJava_CW.serialization_deserialization.deserialization.deserialization_pr1;

import com.CoreJava_CW.serialization_deserialization.serialization.serialization_pr1.Vehicle;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization_pr1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\dipan\\Desktop\\Vehicle_sr.txt");
        try{

            if (file.exists())
            {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);

                Vehicle vehicle=(Vehicle)ois.readObject();
                System.out.println(vehicle);
                ois.close();
                fis.close();

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
