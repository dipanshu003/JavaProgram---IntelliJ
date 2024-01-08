package com.CoreJava_CW.file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) throws IOException {
        //Code to create file
        File file = new File("C:\\Users\\dipan\\Desktop\\sample.txt");//Representing File

        //If file is not Exist then create the file
        if (!file.exists())
        {
            boolean isCreated=file.createNewFile();
            System.out.println(isCreated);
        }

        //writing text into the file using FileOutputStream
        FileOutputStream fos = new FileOutputStream(file);
        String text = "I am Dipanshu Dhole in Sample file";
        fos.write(text.getBytes());
        fos.flush();
        fos.close();

        //reading file using FileInputStream
        FileInputStream fis = new FileInputStream(file);

        int n = fis.read();

        while (n!=-1)
        {
            System.out.print((char)n);
            n = fis.read();
        }

    }
}
