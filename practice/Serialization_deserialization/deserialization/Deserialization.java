package practice.Serialization_deserialization.deserialization;
import practice.Serialization_deserialization.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {

        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\dipan\\Desktop\\File1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp=(Employee)ois.readObject();
            System.out.println(emp);

            ois.close();
            fis.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
