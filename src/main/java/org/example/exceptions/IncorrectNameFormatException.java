package org.example.exceptions;

public class IncorrectNameFormatException extends Exception{

    public IncorrectNameFormatException(String exception, Throwable err) {
        super(exception, err);
    }

    public IncorrectNameFormatException(String exception) {
        super(exception);
    }
}
