package org.practice_java.arrays_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Add_Only_Armstrong_Number {
    public static void main(String[] args) {
        int[] arr = new int[5];
        addArmstrong(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void addArmstrong(int[] arr)
    {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter your number at index "+i+" : ");
            int n = x.nextInt();
            if (armstrongNumber(n)){
                System.out.println("Yes, it is Armstrong Number...");
                arr[i] = n;
                System.out.println();
            }
            else {
                System.out.println("No, it is not Armstrong Number...");
                i--;
                System.out.println();
            }
        }
    }

    public static boolean armstrongNumber(int num)
    {
        int temp = num;
        int count = 0;

        while (temp>0)
        {
            int n = temp%10;
            temp = temp/10;
            count++;
        }


        int temp1 = num;
        int arm = 0;

        while (temp1 >0)
        {
            int n = temp1%10;
            temp1 = temp1/10;
            int multi = 1;

            for (int i = 0; i < count; i++) {
                multi = multi * n;
            }
            arm = arm+multi;
        }
        if (arm==num)
        {
            return true;
        }

        return false;
    }
}
