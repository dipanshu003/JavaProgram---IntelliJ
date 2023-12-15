package com.CoreJava_CW.transferStatement;

public class TransferStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i==4)
            {
                continue;
            } else if (i==8) {
                break;
            } else {
                System.out.println(i);
            }

        }

    }
}
