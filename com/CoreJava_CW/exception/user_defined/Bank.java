package com.CoreJava_CW.exception.user_defined;

public class Bank {

    double balance;
    Bank(double balance)
    {
        this.balance = balance;
    }

    public void withdraw(double amount)
    {
        if (amount > balance)
        {
            throw new InsufficientFundsException ("Amount is not sufficient...");
        }
        else {
            System.out.println("Your Balance is -> "+(balance-amount));
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank(10000);
        b.withdraw(20000);
    }
}
