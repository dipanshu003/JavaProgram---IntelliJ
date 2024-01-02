package com.Interview_Practice.pr1;
import java.util.Scanner;

public class Multiple_of_5 {
    public static void main(String[] args) {
        multi5();
    }

    public static void multi5()
    {
        while (true)
        {
            Scanner x = new Scanner(System.in);
            System.out.print("Enter until what you want : ");
            int n = x.nextInt();

            for (int i = 1; i <=n ; i++) {
                System.out.println(5*i);
            }
        }
    }
}
