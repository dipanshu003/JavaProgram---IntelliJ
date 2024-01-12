package org.practice_java.user_defined_exception;

public class VoteClass {
    public static void vote(int age) {
        if (age > 18) {
            System.out.println("You can vote..");
        } else {

            throw new TooSmallAgeException("You can not vote..");
        }
    }

    public static void main(String[] args) {
        VoteClass v = new VoteClass();
        v.vote(2);
    }
}
