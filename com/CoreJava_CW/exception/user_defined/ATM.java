package com.CoreJava_CW.exception.user_defined;

public class ATM {
    static int  balance =10000;
    public void checkBalance(int pin)
    {
        if (pin!=3167)
        {
            throw new InvalidPinException("Invalid Pin...");
        }
        else {
            System.out.println("YOur Balance is -> "+balance);
        }
    }

    public static void main(String[] args) {
        ATM a = new ATM();
        a.checkBalance(3167);
    }
}
