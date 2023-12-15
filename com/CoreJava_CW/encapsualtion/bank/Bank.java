package com.CoreJava_CW.encapsualtion.bank;

public class Bank {
    private long accNumber ;
    private int baalance;

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public int getBaalance() {
        return baalance;
    }

    public void setBaalance(int baalance) {
        this.baalance = baalance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accNumber=" + accNumber +
                ", baalance=" + baalance +
                '}';
    }

    public int withdrawl(int amount)
    {
        if (amount<=baalance)
        {
            baalance = baalance-amount;
        }
        else {
            System.out.println("Amount is greater than Balance");
        }
        return baalance;
    }

    public int deposit(int amount)
    {
        baalance = baalance+amount;
        return baalance;
    }

}
