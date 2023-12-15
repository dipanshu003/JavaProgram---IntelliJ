package com.CoreJava_HW.program;

public class RoundOf {

    public static void main(String[] args) {
        RoundOf ro = new RoundOf();
        System.out.println(ro.round(216));
    }
    public  int  round(int num)
    {

        int n = 0;
        int temp = num;

        while (temp > 0)
        {
            n = num%10;

            if (n==0 || n==5)
            {
                return num;
            }
            else {
                if (n>5)
                {
                    int c = n-5;
                    int val = num - c;
                    return  val;
                }
                else {
                    int val2 = num - n;
                    return val2;
                }
            }
        }
        return 0;

    }
}
