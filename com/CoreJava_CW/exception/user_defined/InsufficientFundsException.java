package com.CoreJava_CW.exception.user_defined;

public class InsufficientFundsException extends  RuntimeException{
    InsufficientFundsException(String msg)
    {
        super(msg);
    }
}
