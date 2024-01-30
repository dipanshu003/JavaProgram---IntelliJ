package com.MockTest;

public class StudentPresent {
    public static void main(String[] args) {
        String name = "DIP";

        if (name == "Dip") {
            System.out.println(name);
        } else {
            throw new StudentNotFoundException("Studednt not found...");
        }
    }
}
