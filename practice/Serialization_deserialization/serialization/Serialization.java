package practice.Serialization_deserialization.serialization;

import practice.Serialization_deserialization.Employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {

        String path = "C:\\Users\\dipan\\Desktop\\File1.txt";
        File file = new File(path);
        Employee emp = new Employee(101,"Dipanshu Dhole","ddofficial2002@gmail.com");

        if (!file.exists())
        {
            try
            {
                System.out.println(file.createNewFile());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(emp);
                oos.flush();
                oos.close();;

                fos.flush();
                fos.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
