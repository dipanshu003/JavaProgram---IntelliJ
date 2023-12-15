package com.CoreJava_HW.program;

public class ArmstrongClass {

    public static void main(String[] args) {
        ArmstrongClass.checkArm(2);
    }
    public static void checkArm(int num){
        int temp1 = num,count=0;
        while (temp1>0)
        {
//            int n = temp1 % 10;
            count++;
            temp1= temp1/10;
        }
        System.out.println(count);

        int temp2 = num;
        int arm = 0;

        while (temp2>0)
        {
            int n = temp2 % 10;
            int multi = 1;
            for (int i = 1; i <=count ; i++) {
                multi = multi * n;
            }
            arm = arm + multi;
            temp2 = temp2/10;
        }

        if (arm==num)
        {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }
}
