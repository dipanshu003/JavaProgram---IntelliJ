package practice.Serialization_deserialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int e_id;
    private String e_email;
    private String e_name;

    public Employee()
    {

    }
    public Employee(int e_id,String e_email,String e_name)
    {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_email = e_email;
    }

    public void setE_id(int e_id)
    {
        this.e_id= e_id;
    }

    public int getE_id()
    {
        return e_id;
    }

    public String getE_email() {
        return e_email;
    }

    public void setE_email(String e_email) {
        this.e_email = e_email;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_email='" + e_email + '\'' +
                ", e_name='" + e_name + '\'' +
                '}';
    }
}
