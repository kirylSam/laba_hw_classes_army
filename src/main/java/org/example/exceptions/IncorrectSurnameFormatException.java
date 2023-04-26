package org.example.exceptions;

public class IncorrectSurnameFormatException extends Exception{

    public IncorrectSurnameFormatException(String exception, Throwable err) {
        super(exception, err);
    }

    public IncorrectSurnameFormatException(String exception) {
        super(exception);
    }
}
