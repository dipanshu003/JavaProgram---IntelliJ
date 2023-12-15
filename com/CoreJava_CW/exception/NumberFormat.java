package com.CoreJava_CW.exception;


public class NumberFormat {
        public static void main(String[] args) {
            System.out.println("Start");
            String strNumber = "abc";

            try {
                int number = Integer.parseInt(strNumber);
                System.out.println("Parsed number: " + number);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            System.out.println("end");
        }
    }