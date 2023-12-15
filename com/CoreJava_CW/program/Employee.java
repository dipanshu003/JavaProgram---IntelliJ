package com.CoreJava_CW.program;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter Your Annual Salary : ");
        double salary = x.nextDouble();

        double da = (salary * 10)/100;
        double hra = (salary * 20)/100;
        double pf = (salary * 15)/100;
        double pt = (salary * 10)/100;
        double ta = (salary * 15)/100;

        double gross_sal = salary+da+hra+ta;
        double net_sal = gross_sal -(pf+pt);

        System.out.println();
        System.out.println("Your Gross Salary is "+gross_sal);
        System.out.println("Your Net Salary is "+net_sal);
    }
}
