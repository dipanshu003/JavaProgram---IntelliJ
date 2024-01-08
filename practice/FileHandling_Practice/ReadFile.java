package practice.FileHandling_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\dipan\\Desktop\\File.txt");//Representing File

        try{
//            1.Approach first

//            FileReader fr = new FileReader(file);
//            int n=fr.read();
//
//            while (n!=-1)
//            {
//                System.out.print((char) n);
//                n = fr.read();
//            }
//
//            fr.close();

//            2.Approach Second
            FileInputStream fis = new FileInputStream(file);
            int n = fis.read();
            while (n!=-1)
            {
                System.out.print((char) n);
                n=fis.read();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
