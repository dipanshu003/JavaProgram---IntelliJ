package com.CoreJava_CW.file_handling;

import java.io.*;
import java.util.ArrayList;

public class FileHandling {
    public static void main(String[] args) {
        String path = "C:\\Users\\dipan\\Desktop\\Dip.txt";
        File file = new File(path);
        try{
            System.out.println(file.createNewFile());

            FileWriter fw = new FileWriter(file,true);
            fw.write(", I am Dipanshu...");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            int y=fr.read();

            while (y!=-1)
            {
                System.out.print((char) y);
                y = fr.read();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("File is Created...");


    }
}
