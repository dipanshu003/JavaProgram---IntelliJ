package com.CoreJava_HW.program;

import java.util.Scanner;

public class ArmstrongNumber2 {
    public static int countDigit(int num)
    {
        int count=0;
        while(num>0)
        {
            int n = num % 10;
            num = num/10;
            count++;
        }
        return count;
    }

    public static int calPower(int base,int power)
    {
        int r=1;
        for (int i = 1; i <=power ; i++) {
            r = r*base;
        }
        return r;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int temp = num;
        int arm = 0;
        int res;


        int count = ArmstrongNumber2.countDigit(temp);
        System.out.println("Count of Digit -> "+count);

        while (temp > 0)
        {
            int n = temp %10;
            temp = temp/10;

            res = ArmstrongNumber2.calPower(n,count);
            arm = arm + res;
        }
        if (num == arm)
        {
            System.out.println("This is Armstrong Number");
        }
        else {
            System.out.println("This is Not a Armstrong Number");
        }
    }
}
