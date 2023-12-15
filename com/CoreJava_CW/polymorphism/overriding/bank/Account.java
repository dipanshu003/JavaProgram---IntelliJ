package com.CoreJava_CW.polymorphism.overriding.bank;

public class Account {
    String accType;
    String bankName;
    double balance;

    Account (String accType,String bankName,double balance)
    {
        this.accType = accType;
        this.bankName = bankName;
        this.balance = balance;
    }
    public double withdraw(double amount)
    {
        return 0.0;
    }

    public double deposit(double amount)
    {
        return 0.0;
    }
}
