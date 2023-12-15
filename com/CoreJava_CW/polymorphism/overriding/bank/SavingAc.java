package com.CoreJava_CW.polymorphism.overriding.bank;

public class SavingAc extends Account{

    SavingAc(String accType,String bankName,double balance)
    {
        super(accType, bankName, balance);
    }
    @Override
    public double withdraw(double amount) {
        if (balance>=amount)
        {
            balance = balance - amount;;
            return balance;
        }
        return balance;
    }

    @Override
    public double deposit(double amount) {
        balance = balance+amount;
        return balance;
    }

    @Override
    public String toString() {
        return "SavingAc{" +
                "accType='" + accType + '\'' +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account a = new SavingAc("Saving","Bank of Maharastra",12000);
        a.withdraw(2000);
        System.out.println(a);
        a.deposit(10000);
        System.out.println(a);
    }
}
