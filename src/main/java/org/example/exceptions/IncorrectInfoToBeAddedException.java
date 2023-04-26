package org.example.exceptions;

public class IncorrectInfoToBeAddedException extends Exception{

    public IncorrectInfoToBeAddedException(String exception, Throwable err) {
        super(exception, err);
    }

    public IncorrectInfoToBeAddedException(String exception) {
        super(exception);
    }
}
