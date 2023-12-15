package org.practice_java.static_stuff;

public class Static_Stuff {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,12000);
        System.out.println(e1);
        Employee e2 = new Employee(102,16000);
        System.out.println(e2);
        Employee e3 = new Employee(103,18000);
        System.out.println(e3);

    }
}

class Employee{
    int EmpId;
    int Salary;
    static String ComName="OXO";

    Employee(int EmpID,int Salary)
    {
        this.EmpId = EmpID;
        this.Salary = Salary;
    }

    static void Rename()
    {
        ComName="Dip";
    }

    @Override
    public String toString() {
        return this.Salary+" "+this.EmpId+" "+ComName;
    }
}
