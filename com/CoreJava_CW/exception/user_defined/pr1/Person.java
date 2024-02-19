package com.CoreJava_CW.exception.user_defined.pr1;

public class Person {
    public static void main(String[] args) throws PersonNotFoundException {
        String p_name = "Ram";


        if (!(p_name.equals("Mohan")))
        {
            throw  new PersonNotFoundException("Person not found");
        }
        else {
            System.out.println("Person found");
        }

    }
}
