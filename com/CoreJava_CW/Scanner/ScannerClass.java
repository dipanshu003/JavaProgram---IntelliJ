package com.CoreJava_CW.Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        System.out.print("Enter your Byte Number : ");
        byte bNum = x.nextByte();
        System.out.println("Your Number : "+bNum);


        System.out.print("Enter your Short Number : ");
        short sNum = x.nextShort();
        System.out.println("Your Number : "+sNum);

        System.out.print("Enter your Integer Number : ");
        int iNum = x.nextInt();
        System.out.println("Your Number : "+iNum);

        System.out.print("Enter your Long Number : ");
        long lNum = x.nextLong();
        System.out.println("Your Number : "+lNum);

        System.out.print("Enter your Float Number : ");
        float fNum = x.nextFloat();
        System.out.println("Your Number : "+fNum);

        System.out.print("Enter your Double Number : ");
        double dNum = x.nextDouble();
        System.out.println("Your Number : "+dNum);


        System.out.print("Enter your Name : ");
        String name = x.next();
        System.out.println("Your Number : "+name);

        System.out.print("Enter your true/false: ");
        boolean isTrue = x.nextBoolean();
        System.out.println("Your Ans : "+isTrue);






    }
}
