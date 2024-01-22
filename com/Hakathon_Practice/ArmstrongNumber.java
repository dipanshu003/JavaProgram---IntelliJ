package com.Hakathon_Practice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(0));
    }

    public static boolean isArmstrong(int num)
    {
        int count =0;
        int temp1 = num;
        while (temp1>0)
        {
            int n = num%10;
            count++;
            temp1/=10;
        }

        int temp2 = num;
        int arm =0;

        while (temp2>0)
        {
            int n = temp2%10;
            int multi = 1;
            for (int i = 1; i <=count ; i++) {
                multi = multi*n;
            }
            arm+=multi;
            temp2/=10;
        }
        if (arm==num)
        {
            return true;

        }
        return false;
    }
}
