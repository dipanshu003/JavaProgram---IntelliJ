package com.CoreJava_HW.program;
public class PrintSequence {
    public static void main(String[] args) {
        int i = 1;
        int j =1;
        while (i<=36)
        {
            System.out.print(i+" ");
            i=i+j;
            j++;
            i++;
        }
    }
}
