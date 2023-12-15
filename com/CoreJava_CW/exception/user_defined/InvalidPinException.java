package com.CoreJava_CW.exception.user_defined;

public class InvalidPinException extends RuntimeException{
    InvalidPinException(String msg)
    {
        super(msg);
    }
}
