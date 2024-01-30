package com.MockTest;

public class StudentNotFoundException extends RuntimeException{
    StudentNotFoundException(String msg)
    {
        super(msg);
    }

}
