package com.CoreJava_CW.abstraction.example3_atm;

public class ATM_Verify extends ATM{

    public ATM_Verify(String accHolderName, String bankBranch, int accNo, int balance) {
        super(accHolderName, bankBranch, accNo, balance);
    }

    @Override
    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println(balance);
    }

    @Override
    public void withdraw(float amount) {
        if (amount<=balance)
        {
            balance = balance-amount;
            System.out.println(balance);
        }
    }
    public static void main(String[] args) {
     ATM_Verify a = new ATM_Verify("Dipanshu Dhole","Pune",97297394,20);
     a.withdraw(10);
     System.out.println();
     a.deposit(30);
    }
}
