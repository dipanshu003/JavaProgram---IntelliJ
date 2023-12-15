package com.CoreJava_CW.program;

import java.util.Scanner;

public class PrimeNumber_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,count=0;
//        int i=1;

        System.out.print("Enter Any Number to Check Prime or Not : ");
        n = sc.nextInt();
//        while (i<=n)
//
//        {
//            if (n%i==0)
//            {
//                count+=1;
//            }
//            i++;
//        }

        for (int i = 1; i <= n; i++) {
            if (n%i==0)
            {
                count ++;
            }
        }

        if (count==2)
        {
            System.out.println(n+" is a Prime Number.");
        }
        else {
            System.out.println(n+" is not a Prime Number.");
        }

    }
}
