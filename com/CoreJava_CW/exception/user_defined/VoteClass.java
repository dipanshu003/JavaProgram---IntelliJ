package com.CoreJava_CW.exception.user_defined;

public class VoteClass {
    public void age(int age)
    {
        if (age<18)
        {
            throw new TooSmallAgeException("You can not vote...");
        }
        else {
            System.out.println("You can vote...");
        }
    }

    public static void main(String[] args) {
        VoteClass v = new VoteClass();
        v.age(17);
    }
}
