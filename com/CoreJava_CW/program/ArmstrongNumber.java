package com.CoreJava_CW.program;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(367));
    }

    public static boolean isArmstrong(int num)
    {
        int temp1 = num;
        int n = 0;
        int count=0;
        while (temp1>0)
        {
            n = temp1 % 10;
            temp1 = temp1/10;
            count++;
        }
//        System.out.println(count);

        int temp2 = num;
        int n1 = 0;
        int arm=0;
        while (temp2>0)
        {
            n1 = temp2%10;
            int multi = 1;
            for (int i = 1; i <= count; i++) {
                multi = multi * n1;
            }
            temp2 = temp2/10;

            arm = arm+multi;
        }

        if (arm==num)
        {
            return true;
        }
        return false;
    }
}
