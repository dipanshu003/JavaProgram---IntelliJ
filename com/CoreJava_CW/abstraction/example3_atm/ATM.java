package com.CoreJava_CW.abstraction.example3_atm;

public abstract class ATM {
    String accHolderName,bankBranch;
    int accNo;
    float balance;

    public ATM(String accHolderName, String bankBranch, int accNo, int balance) {
        this.accHolderName = accHolderName;
        this.bankBranch = bankBranch;
        this.accNo = accNo;
        this.balance = balance;
    }
    public abstract void deposit(float amount);
    public abstract void withdraw(float amount);


}
