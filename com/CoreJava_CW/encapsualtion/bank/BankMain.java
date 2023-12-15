package com.CoreJava_CW.encapsualtion.bank;

public class BankMain
{
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.setBaalance(10000);
        bank.setAccNumber(345799);

        System.out.println("Your account balance is : "+bank.getBaalance());
        System.out.println("Your Account Number is : "+bank.getAccNumber());

        System.out.println();

        System.out.println(bank.withdrawl(5000));
        System.out.println(bank.deposit(10000));
    }
}
