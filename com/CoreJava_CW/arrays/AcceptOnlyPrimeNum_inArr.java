package com.CoreJava_CW.arrays;

import java.util.Scanner;

public class AcceptOnlyPrimeNum_inArr {
    public static void main(String[] args) {
        int[] arr = new int[3];
        acceptPrime(arr);
//        System.out.println(prime(4));

    }

    public static void acceptPrime(int[] arr)
    {
        Scanner x  = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Value at index no. "+i+" : ");
            int n = x.nextInt();
            boolean isPrime = prime(n);

            if (isPrime == true)
            {
                arr[i] = n;
            }
            else {
                i--;
            }

        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static boolean prime(int n)
    {
        int i = 1;
        int count = 0;

        while (i<=n)
        {
            if (n%i==0)
            {
                count++;
            }
            i++;
        }
        if (count==2)
        {
            return true;
        }
        return false;
    }

}
