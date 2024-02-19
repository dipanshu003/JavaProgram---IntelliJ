package com.CoreJava_CW.exception.CustomizeException.InvalidPinException;

public class InvalidPinException extends Exception {
    String msg;
    public InvalidPinException(String msg)
    {
        super(msg);
        this.msg  = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
