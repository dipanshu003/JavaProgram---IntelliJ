package com.CoreJava_HW.method;

import java.util.Scanner;

public class Employee {
    int id;
    String name;
    double sal,hra,ta,da,pt,pf,gross,net_sal;
    Scanner x = new Scanner(System.in);

    public void accept()
    {

        System.out.println("Enter id : ");
        id = x.nextInt();

        x.nextLine();
        System.out.println("Enter Name : ");
        name = x.nextLine();

        System.out.println("Enter Salary : ");
        sal = x.nextDouble();

    }

    public double getHra(float hraPara)
    {
        hra = (sal*hraPara)/100;
        return hra;
    }
    public double getta(float taPara)
    {
        ta = (sal*taPara)/100;
        return ta;
    }
    public double getDa(float daPara)
    {
        da = (sal*daPara)/100;
        return da;
    }
    public double getPt(float ptPara)
    {
        pt = (sal*ptPara)/100;
        return pt;
    }
    public double getPf(float pfPara)
    {
        pf = (sal*pfPara)/100;
        return pf;
    }

    public double getGross()
    {
        gross = pt+pf+hra+ta+da+sal;
        return gross;
    }

    public double getNet_sal()
    {
        net_sal = gross-(pt+pf);
        return net_sal;
    }

    public void show()
    {
        System.out.println("Name - > "+name);
        System.out.println("Id - >"+id);
        System.out.println("Salary - > "+sal);

    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.accept();
        e1.getDa(12);
        e1.getta(2);
        e1.getPt(5);
        e1.getPf(3);
        e1.getHra(10);
        System.out.println(e1.getGross());
        System.out.println(e1.getNet_sal());
        e1.show();

    }


}
