package com.CoreJava_CW.constructor.employee;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

//        EmployeeClass e1 = new EmployeeClass("Mahesh Upase","HR",30000);
//        EmployeeClass e2 = new EmployeeClass("Vivek Singh","Teacher",20000);

        Scanner x= new Scanner(System.in);

        for (int i = 1; i <=3 ; i++) {

            System.out.print("Enter Your Name : ");
            String name = x.next();
            System.out.print("Enter Your Post : ");
            String post = x.next();
            System.out.print("Enter Your Salary : ");
            int  sal = x.nextInt();


            EmployeeClass e = new EmployeeClass(name , post, sal);
            
        }

    }
}
