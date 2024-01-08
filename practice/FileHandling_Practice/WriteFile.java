package practice.FileHandling_Practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\dipan\\Desktop\\File.txt";
        File file = new File(path);

        if (!file.exists()) {
            try {
                boolean isCreated = file.createNewFile();
                System.out.println(isCreated);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try {
//            //1.Approach First
//            FileWriter fw  = new FileWriter(file);
//            fw.write("Why this Kolaveri de...");
//           fw.flush();
//            fw.close();

            //2.Approach Second
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("My name is Khan...".getBytes());
            fos.flush();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
