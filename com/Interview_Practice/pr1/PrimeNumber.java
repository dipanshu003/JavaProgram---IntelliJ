package com.Interview_Practice.pr1;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
