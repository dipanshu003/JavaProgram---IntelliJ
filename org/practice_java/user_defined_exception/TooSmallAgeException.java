package org.practice_java.user_defined_exception;

public class TooSmallAgeException extends RuntimeException{
    TooSmallAgeException(String msg)
    {
        super(msg);
    }
}
