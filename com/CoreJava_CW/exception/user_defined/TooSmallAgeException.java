package com.CoreJava_CW.exception.user_defined;

public class TooSmallAgeException extends RuntimeException{
    TooSmallAgeException(String msg)
    {
        super(msg);
    }

}
