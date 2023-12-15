package com.CoreJava_CW.exception.user_defined;

public class User {

    String username,pass;

    User(String username,String pass)
    {
        this.username = username;
        if (pass.length()<8)
        {
            throw new InvalidPasswordException("InvalidPasswordException....");
        }
        else {
            this.pass = pass;
        }

        System.out.println("Username -> "+username);
        System.out.println("Password -> "+pass);
    }

    public static void main(String[] args) {
        User u = new User("dip","njjh");
    }


}
