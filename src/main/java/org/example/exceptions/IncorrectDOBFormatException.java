package org.example.exceptions;

public class IncorrectDOBFormatException extends Exception{

    public IncorrectDOBFormatException(String exception, Throwable err) {
        super(exception, err);
    }

    public IncorrectDOBFormatException(String exception) {
        super(exception);
    }
}
