package com.MockTest;

public class InputNotCorrectException extends Exception{

    private String msg;
    public InputNotCorrectException(String msg)
    {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
