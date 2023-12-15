package com.CoreJava_CW.exception.user_defined;

public class Number {
       /*
         -> create int divide(int dividend , int divisor) method
         -> if no is negative or is equal to 0 then throw InvalidInputException  exception else print the output of division
    - create main method in another class n call divide () method.
*/
    public int divide(int dividend , int divisor)
    {
        int no = dividend/divisor;

        if (no<=0)
        {
            throw  new InsufficientFundsException("Number is less than 0...");
        }
        return no;
    }

    public static void main(String[] args) {
        Number n = new Number();
        System.out.println(n.divide(0,2));
    }
}
