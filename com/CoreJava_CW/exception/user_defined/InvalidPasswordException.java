package com.CoreJava_CW.exception.user_defined;

public class InvalidPasswordException extends RuntimeException{
    InvalidPasswordException(String msg)
    {
        super(msg);
    }
}
